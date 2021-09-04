package com.tedm.socialnetworkcompose.domain.models

import com.tedm.socialnetworkcompose.domain.util.ActivityAction

data class Activity(
    val username: String,
    val actionType: ActivityAction,
    val formattedTime: String
)
