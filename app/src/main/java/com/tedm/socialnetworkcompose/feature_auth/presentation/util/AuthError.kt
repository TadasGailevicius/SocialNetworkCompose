package com.tedm.socialnetworkcompose.feature_auth.presentation.util

import com.tedm.socialnetworkcompose.core.util.Error

sealed class AuthError : Error() {
    object FieldEmpty : AuthError()
    object InputTooShort : AuthError()
    object InvalidEmail: AuthError()
    object InvalidPassword : AuthError()
}
