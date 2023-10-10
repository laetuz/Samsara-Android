package com.neotica.samsara.ui.navigation

sealed class Screen (val route: String) {
    data object Splash: Screen("splash")
    data object HomeScreen: Screen("home-screen")
}