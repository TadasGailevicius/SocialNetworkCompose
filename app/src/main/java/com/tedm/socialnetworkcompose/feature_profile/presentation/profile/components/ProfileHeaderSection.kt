package com.tedm.socialnetworkcompose.feature_profile.presentation.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tedm.socialnetworkcompose.R
import com.tedm.socialnetworkcompose.core.domain.models.User
import com.tedm.socialnetworkcompose.core.presentation.ui.theme.ProfilePictureSizeLarge
import com.tedm.socialnetworkcompose.core.presentation.ui.theme.SpaceLarge
import com.tedm.socialnetworkcompose.core.presentation.ui.theme.SpaceMedium
import com.tedm.socialnetworkcompose.core.presentation.ui.theme.SpaceSmall

@Composable
fun ProfileHeaderSection(
    modifier: Modifier = Modifier,
    user: User,
    isOwnProfile: Boolean = true,
    onEditClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .offset(
                    x =
                    if (isOwnProfile) {
                        (30.dp + SpaceSmall) / 2f
                    } else 0.dp
                )
        ) {
            Text(
                text = user.username,
                style = MaterialTheme.typography.h1.copy(
                    fontSize = 24.sp
                ),
                textAlign = TextAlign.Center
            )
            if (isOwnProfile) {
                Spacer(modifier = Modifier.width(SpaceSmall))
                IconButton(
                    onClick = { onEditClick },
                    modifier = Modifier.size(30.dp),
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = stringResource(id = R.string.edit)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(SpaceMedium))
        Text(
            text = user.description,
            style = MaterialTheme.typography.body2,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(SpaceLarge))
        ProfileStats(
            user = user,
            isOwnProfile = isOwnProfile
        )
    }


}