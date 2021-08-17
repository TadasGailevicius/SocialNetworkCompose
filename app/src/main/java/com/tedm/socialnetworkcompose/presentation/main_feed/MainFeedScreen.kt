package com.tedm.socialnetworkcompose.presentation.main_feed

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.tedm.socialnetworkcompose.R
import com.tedm.socialnetworkcompose.presentation.components.Post
import com.tedm.socialnetworkcompose.presentation.components.StandardToolbar
import com.tedm.socialnetworkcompose.presentation.util.Screen

@Composable
fun MainFeedScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        StandardToolbar(
            navController = navController,
            title = {
                Text(
                    text = stringResource(id = R.string.your_feed),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onBackground
                )
            },
            modifier = Modifier.fillMaxWidth(),
            showBackArrow = true,
            navActions = {
                IconButton(onClick = {
                    navController.navigate(Screen.SearchScreen.route)
                }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = MaterialTheme.colors.onBackground,
                    )
                }
            }

        )
        
        Post(
            post = com.tedm.socialnetworkcompose.domain.models.Post(
                username = "Tadas Gailevičius",
                imageUrl = "",
                profilePictureUrl = "",
                description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed " +
                        "diam nonumy eirmod tempor invidunt ut labore et dolore " +
                        "magna aliquyam erat, sed diam voluptua...",
                likeCount = 17,
                commentCount = 7
            ),
            onPostClick = {
                navController.navigate(Screen.PostDetailScreen.route)
            }
        )
    }
}