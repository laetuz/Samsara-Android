package com.neotica.samsara.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.neotica.samsara.ui.screen.HomeScreen

fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
) {
    composable(Screen.HomeScreen.route){
        HomeScreen(navHostController = navController)
    }
}