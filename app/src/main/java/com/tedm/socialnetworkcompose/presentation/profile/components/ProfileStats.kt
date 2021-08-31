package com.tedm.socialnetworkcompose.presentation.profile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.tedm.socialnetworkcompose.R
import com.tedm.socialnetworkcompose.domain.models.User
import com.tedm.socialnetworkcompose.presentation.ui.theme.SpaceLarge

@Composable
fun ProfileStats(
    modifier: Modifier = Modifier,
    isOwnProfile: Boolean = true,
    isFollowing: Boolean = true,
    onFollowClick: () -> Unit = {},
    user: User,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ProfileNumber(
            number = user.followerCount,
            text = stringResource(id = R.string.followers)
        )
        Spacer(modifier = Modifier.width(SpaceLarge))
        ProfileNumber(
            number = user.followingCount,
            text = stringResource(id = R.string.following)
        )
        Spacer(modifier = Modifier.width(SpaceLarge))
        ProfileNumber(
            number = user.postCount,
            text = stringResource(id = R.string.posts)
        )
        Spacer(modifier = Modifier.width(SpaceLarge))
        if(isOwnProfile){
            Button(
                onClick = onFollowClick,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if(isFollowing){
                        Color.Red
                    } else MaterialTheme.colors.primary
                )
            ) {
                Text(
                    text = if(isFollowing) {
                        stringResource(id = R.string.unfollow)
                    } else {
                        stringResource(id = R.string.follow)
                    },
                    color = if(isFollowing) {
                        Color.White
                    } else {
                        MaterialTheme.colors.onPrimary
                    }
                )
            }
        }

    }
}