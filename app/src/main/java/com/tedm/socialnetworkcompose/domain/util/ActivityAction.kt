package com.tedm.socialnetworkcompose.domain.util

import android.app.Activity

sealed class ActivityAction {
    object LikedPost : ActivityAction()
    object CommentedOnPost: ActivityAction()
    object FollowedYou: ActivityAction()
}
