package com.tedm.socialnetworkcompose.core.domain.models

import com.tedm.socialnetworkcompose.feature_activity.domain.ActivityAction

data class Activity(
    val username: String,
    val actionType: ActivityAction,
    val formattedTime: String
)
