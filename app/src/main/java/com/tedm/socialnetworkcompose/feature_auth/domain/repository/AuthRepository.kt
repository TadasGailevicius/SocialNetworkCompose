package com.tedm.socialnetworkcompose.feature_auth.domain.repository

import com.tedm.socialnetworkcompose.core.util.SimpleResource

interface AuthRepository {

    suspend fun register(
        email: String,
        username: String,
        password: String
    ): SimpleResource
}