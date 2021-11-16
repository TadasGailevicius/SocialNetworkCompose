package com.tedm.socialnetworkcompose.feature_profile.presentation.util

import com.tedm.socialnetworkcompose.core.util.Error

sealed class EditProfileError : Error() {
    object FieldEmpty: EditProfileError()
}
