package com.tedm.socialnetworkcompose.feature_post.presentation.util

import com.tedm.socialnetworkcompose.core.util.Error

sealed class PostDescriptionError : Error() {
    object FieldEmpty: PostDescriptionError()
}
