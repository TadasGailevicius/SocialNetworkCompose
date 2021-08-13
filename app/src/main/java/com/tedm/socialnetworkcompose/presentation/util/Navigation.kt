package com.tedm.socialnetworkcompose.presentation.util

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tedm.socialnetworkcompose.presentation.activity.ActivityScreen
import com.tedm.socialnetworkcompose.presentation.chat.ChatScreen
import com.tedm.socialnetworkcompose.presentation.login.LoginScreen
import com.tedm.socialnetworkcompose.presentation.main_feed.MainFeedScreen
import com.tedm.socialnetworkcompose.presentation.profile.ProfileScreen
import com.tedm.socialnetworkcompose.presentation.register.RegisterScreen
import com.tedm.socialnetworkcompose.presentation.splash.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
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
        composable(Screen.ActivityScreen.route){
            ActivityScreen(navController = navController)
        }
        composable(Screen.ProfileScreen.route){
            ProfileScreen(navController = navController)
        }
    }
    
}