package com.tedm.socialnetworkcompose.feature_auth.data.dto.request

data class CreateAccountRequest(
    val email: String,
    val username: String,
    val password: String
)
