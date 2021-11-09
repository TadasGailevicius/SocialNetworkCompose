package com.tedm.socialnetworkcompose.presentation.util

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tedm.socialnetworkcompose.core.domain.models.Post
import com.tedm.socialnetworkcompose.core.util.Screen
import com.tedm.socialnetworkcompose.feature_activity.presentation.activity.ActivityScreen
import com.tedm.socialnetworkcompose.feature_chat.presentation.chat.ChatScreen
import com.tedm.socialnetworkcompose.feature_post.presentation.create_post.CreatePostScreen
import com.tedm.socialnetworkcompose.feature_profile.presentation.edit_profile.EditProfileScreen
import com.tedm.socialnetworkcompose.feature_auth.presentation.login.LoginScreen
import com.tedm.socialnetworkcompose.feature_post.presentation.main_feed.MainFeedScreen
import com.tedm.socialnetworkcompose.feature_post.presentation.person_list.PersonListScreen
import com.tedm.socialnetworkcompose.feature_post.presentation.post_detail.PostDetailScreen
import com.tedm.socialnetworkcompose.feature_profile.presentation.profile.ProfileScreen
import com.tedm.socialnetworkcompose.feature_auth.presentation.register.RegisterScreen
import com.tedm.socialnetworkcompose.feature_profile.presentation.search.SearchScreen
import com.tedm.socialnetworkcompose.presentation.splash.SplashScreen

@ExperimentalMaterialApi
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }
        composable(Screen.RegisterScreen.route) {
            RegisterScreen(navController = navController)
        }
        composable(Screen.MainFeedScreen.route) {
            MainFeedScreen(navController = navController)
        }
        composable(Screen.ChatScreen.route) {
            ChatScreen(navController = navController)
        }
        composable(Screen.ActivityScreen.route) {
            ActivityScreen(navController = navController)
        }
        composable(Screen.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }
        composable(Screen.EditProfileScreen.route) {
            EditProfileScreen(navController = navController)
        }
        composable(Screen.CreatePostScreen.route) {
            CreatePostScreen(navController = navController)
        }
        composable(Screen.SearchScreen.route) {
            SearchScreen(navController = navController)
        }
        composable(Screen.PersonListScreen.route) {
            PersonListScreen(navController = navController)
        }
        composable(Screen.PostDetailScreen.route) {
            PostDetailScreen(
                navController = navController,
                post = Post(
                    username = "Tadas Gailevičius",
                    imageUrl = "",
                    profilePictureUrl = "",
                    description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed\n" +
                            "diam nonumy eirmod tempor invidunt ut labore et dolore \n" +
                            "magna aliquyam erat, sed diam voluptua Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed\\n\" +\n" +
                            "                    \"diam nonumy eirmod tempor invidunt ut labore et dolore \\n\" +\n" +
                            "                    \"magna aliquyam erat, sed diam voluptua",
                    likeCount = 17,
                    commentCount = 7
                )
            )
        }
    }
}