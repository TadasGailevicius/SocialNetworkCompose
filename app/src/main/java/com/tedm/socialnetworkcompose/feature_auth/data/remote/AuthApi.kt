package com.tedm.socialnetworkcompose.feature_auth.data.remote

import com.tedm.socialnetworkcompose.core.data.dto.response.BasicApiResponse
import com.tedm.socialnetworkcompose.feature_auth.data.dto.request.CreateAccountRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST("/api/user/create")
    suspend fun register(
        @Body request: CreateAccountRequest
    ): BasicApiResponse<Unit>

    companion object {
        const val BASE_URL = "http://192.168.0.2:8080/"
    }

}