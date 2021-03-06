package com.tedm.socialnetworkcompose.feature_auth.data.repository

import com.tedm.socialnetworkcompose.core.util.Resource
import com.tedm.socialnetworkcompose.core.util.SimpleResource
import com.tedm.socialnetworkcompose.core.util.UiText
import com.tedm.socialnetworkcompose.feature_auth.data.dto.request.CreateAccountRequest
import com.tedm.socialnetworkcompose.feature_auth.data.remote.AuthApi
import com.tedm.socialnetworkcompose.feature_auth.domain.repository.AuthRepository
import retrofit2.HttpException
import java.io.IOException
import com.tedm.socialnetworkcompose.R

class AuthRepositoryImpl(
    private val api: AuthApi
) : AuthRepository {
    override suspend fun register(
        email: String,
        username: String,
        password: String
    ): SimpleResource {
        val request = CreateAccountRequest(email, username, password)
        return try {
            val response = api.register(request = request)
            if(response.successful) {
                Resource.Success(Unit)
            } else {
                response.message?.let { msg ->
                    Resource.Error(UiText.DynamicString(msg))
                } ?: Resource.Error(UiText.StringResource(R.string.error_unknown))
            }
        } catch(e: IOException) {
            Resource.Error(
                uiText = UiText.StringResource(R.string.error_couldnt_reach_server)
            )
        } catch(e: HttpException) {
            Resource.Error(
                uiText = UiText.StringResource(R.string.oops_something_went_wrong)
            )
        }
    }
}