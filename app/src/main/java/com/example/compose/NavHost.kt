package com.example.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.Screens.HomeScreen
import com.example.compose.Screens.LogInScreen

@Composable
fun AppNav() {
    val navController = rememberNavController()
    Surface(
        Modifier
            .fillMaxSize()
            .padding(25.dp),

        ) {
        NavHost(
            navController = navController,
            startDestination = "login",
        ) {
            composable("login"){ LogInScreen(navController) }
            composable("home"){ HomeScreen(navController) }
        }
    }
}