package com.tedm.socialnetworkcompose.core.domain.states

import com.tedm.socialnetworkcompose.core.util.Error

data class StandardTextFieldState(
    val text: String = "",
    val error: Error? = null
)
