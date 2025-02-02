package com.example.apiapplication.Screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "MainScreen") {
        composable("MainScreen") {
            MainScreen(navController)
        }
        composable(
            "DetailsScreen/{username}/{email}/{mobile}/{profileImage}",
            arguments = listOf(
                navArgument("username") { type = NavType.StringType },
                navArgument("email") { type = NavType.StringType },
                navArgument("mobile") { type = NavType.StringType },
                navArgument("profileImage") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            DetailsScreen(
                username = backStackEntry.arguments?.getString("username") ?: "",
                email = backStackEntry.arguments?.getString("email") ?: "",
                mobile = backStackEntry.arguments?.getString("mobile") ?: "",
                profileImage = backStackEntry.arguments?.getString("profileImage") ?: ""
            )
        }
    }

}