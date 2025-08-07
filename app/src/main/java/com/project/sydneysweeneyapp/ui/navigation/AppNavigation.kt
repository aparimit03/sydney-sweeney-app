package com.project.sydneysweeneyapp.ui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.project.sydneysweeneyapp.ui.screens.MissionsScreen
import com.project.sydneysweeneyapp.ui.screens.ProfileScreen
import com.project.sydneysweeneyapp.ui.screens.TapScreen
import com.project.sydneysweeneyapp.ui.screens.TreasuryScreen

object NavigationRoutes {
	const val TAP = "tap"
	const val TREASURY = "treasury"
	const val MISSIONS = "missions"
	const val PROFILE = "profile"
}

@Composable
fun AppNavigation(navController: NavHostController, padding: PaddingValues) {
	NavHost(
		navController = navController,
		startDestination = NavigationRoutes.TAP,
		modifier = Modifier
            .padding(padding)
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.7f))
	) {
		composable(NavigationRoutes.TAP) {
			TapScreen()
		}
		composable(NavigationRoutes.TREASURY) {
			TreasuryScreen()
		}
		composable(NavigationRoutes.MISSIONS) {
			MissionsScreen()
		}
		composable(NavigationRoutes.PROFILE) {
			ProfileScreen()
		}
	}
}
