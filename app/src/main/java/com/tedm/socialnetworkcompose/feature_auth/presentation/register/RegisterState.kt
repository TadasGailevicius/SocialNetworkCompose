package com.tedm.socialnetworkcompose.feature_auth.presentation.register

import com.tedm.socialnetworkcompose.core.util.UiText

data class RegisterState(
    val successful: Boolean? = null,
    val message: UiText? = null,
    val isLoading: Boolean = false

)
