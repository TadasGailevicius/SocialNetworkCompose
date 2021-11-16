package com.tedm.socialnetworkcompose.core.domain.states

import com.tedm.socialnetworkcompose.core.util.Error

data class PasswordTextFieldState(
    val text: String = "",
    val error: Error? = null,
    val isPasswordVisible: Boolean = false
)
