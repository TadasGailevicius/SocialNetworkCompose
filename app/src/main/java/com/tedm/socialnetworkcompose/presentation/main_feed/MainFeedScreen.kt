package com.tedm.socialnetworkcompose.presentation.main_feed

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.tedm.socialnetworkcompose.presentation.components.Post

@Composable
fun MainFeedScreen(
    navController: NavController
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Post(
            post = com.tedm.socialnetworkcompose.domain.models.Post(
                username = "Tadas Gailevičius",
                imageUrl = "",
                profilePictureUrl = "",
                description = "Words are like wind. A good act does not wash out the bad, nor a bad act the good. Each should have its own reward. The North remembers. The Knight of Lemonwood. Dunc the Lunk, thick as a castle wall. The wolf and the lion. I pledge my life and honor to the Night's Watch, for this night and all the nights to come. I pledge my life and honor to the Night's Watch, for this night and all the nights to come. House Tarly of Horn Hill You know nothing, Jon Snow. Bastards are born of passion, aren't they? We don't despise them in Dorne. It's ten thousand miles between Kings landing and the wall. The rains of castamere. A dream of Spring. A forked purple lightning bolt, on black field speckled with four-pointed stars. The War of the 5 kings. The bear and the maiden fair. Winter is coming. The War of the 5 kings. Words are like wind. The bear and the maiden fair. Winter is coming. King in the North. The Dothraki do things in their own time, for their own reasons. The winds of Winter.",
                likeCount = 17,
                commentCount = 5
            )
        )
        Post(
            post = com.tedm.socialnetworkcompose.domain.models.Post(
                username = "Tadas Gailevičius",
                imageUrl = "",
                profilePictureUrl = "",
                description = "Words are like wind. A good act does not wash out the bad, nor a bad act the good. Each should have its own reward. The North remembers. The Knight of Lemonwood. Dunc the Lunk, thick as a castle wall. The wolf and the lion. I pledge my life and honor to the Night's Watch, for this night and all the nights to come. I pledge my life and honor to the Night's Watch, for this night and all the nights to come. House Tarly of Horn Hill You know nothing, Jon Snow. Bastards are born of passion, aren't they? We don't despise them in Dorne. It's ten thousand miles between Kings landing and the wall. The rains of castamere. A dream of Spring. A forked purple lightning bolt, on black field speckled with four-pointed stars. The War of the 5 kings. The bear and the maiden fair. Winter is coming. The War of the 5 kings. Words are like wind. The bear and the maiden fair. Winter is coming. King in the North. The Dothraki do things in their own time, for their own reasons. The winds of Winter.",
                likeCount = 17,
                commentCount = 5
            )
        )
    }

}