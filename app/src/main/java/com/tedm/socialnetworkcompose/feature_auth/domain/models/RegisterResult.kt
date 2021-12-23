package com.tedm.socialnetworkcompose.feature_auth.domain.models

import com.tedm.socialnetworkcompose.core.util.SimpleResource
import com.tedm.socialnetworkcompose.feature_auth.presentation.util.AuthError

data class RegisterResult(
    val emailError: AuthError? = null,
    val usernameError: AuthError? = null,
    val passwordError: AuthError? = null,
    val result: SimpleResource? = null
)