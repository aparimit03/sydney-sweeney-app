package com.project.sydneysweeneyapp.ui.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.project.sydneysweeneyapp.ui.components.BottomBar
import com.project.sydneysweeneyapp.ui.navigation.AppNavigation

@Composable
fun MainScreen() {
	val navController = rememberNavController()

	Scaffold(
		topBar = { /* TopBar() */ },
		bottomBar = { BottomBar(navController = navController) },
	) { padding ->
		AppNavigation(
			navController = navController,
			padding = padding,
		)
	}
}