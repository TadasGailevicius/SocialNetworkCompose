package com.tedm.socialnetworkcompose.presentation.person_list_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.tedm.socialnetworkcompose.R
import com.tedm.socialnetworkcompose.domain.models.User
import com.tedm.socialnetworkcompose.presentation.components.StandardToolbar
import com.tedm.socialnetworkcompose.presentation.components.UserProfileItem
import com.tedm.socialnetworkcompose.presentation.ui.theme.LeadingIconSizeMedium
import com.tedm.socialnetworkcompose.presentation.ui.theme.SpaceLarge
import com.tedm.socialnetworkcompose.presentation.ui.theme.SpaceMedium

@ExperimentalMaterialApi
@Composable
fun PersonListScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        StandardToolbar(
            navController = navController,
            showBackArrow = true,
            title = {
                Text(
                    text = stringResource(id = R.string.liked_by),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onBackground
                )
            }
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(SpaceLarge)
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                items(10){
                    UserProfileItem(
                        user = User(
                            profilePictureUrl = "",
                            username = "Tadas Gailevičius",
                            description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed\n" +
                                    "diam nonumy eirmod tempor invidunt ut labore et dolore \n" +
                                    "magna aliquyam erat, sed diam voluptua",
                            followerCount = 234,
                            followingCount = 534,
                            postCount = 65
                        ),
                        actionIcon = {
                            Icon(
                                imageVector = Icons.Default.PersonAdd,
                                contentDescription = null,
                                tint = MaterialTheme.colors.onBackground,
                                modifier = Modifier.size(LeadingIconSizeMedium)
                            )
                        }
                    )
                    Spacer(modifier = Modifier.height(SpaceMedium))
                }
            }
        }

    }
}