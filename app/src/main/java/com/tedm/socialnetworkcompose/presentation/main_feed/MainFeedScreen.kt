package com.tedm.socialnetworkcompose.presentation.main_feed

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.tedm.socialnetworkcompose.presentation.components.Post

@Composable
fun MainFeedScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Post(
            post = com.tedm.socialnetworkcompose.domain.models.Post(
                username = "Philipp Lackner",
                imageUrl = "",
                profilePictureUrl = "",
                description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed\n" +
                        "diam nonumy eirmod tempor invidunt ut labore et dolore \n" +
                        "magna aliquyam erat, sed diam voluptua...",
                likeCount = 17,
                commentCount = 7
            ),
        )
    }
}