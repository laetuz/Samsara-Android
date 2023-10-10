package com.neotica.samsara.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.neotica.samsara.ui.navigation.Screen
import com.neotica.samsara.ui.navigation.mainNavGraph

@Composable
fun SamsaraApp(
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Box {
        NavHost(
            navController = navController,
            startDestination = Screen.HomeScreen.route,
        ) {
           mainNavGraph(navController = navController)
        }
    }

}