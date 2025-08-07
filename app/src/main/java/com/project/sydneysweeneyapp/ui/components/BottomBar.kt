package com.project.sydneysweeneyapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.project.sydneysweeneyapp.ui.navigation.NavigationRoutes
import com.project.sydneysweeneyapp.ui.theme.Purple80
import com.project.sydneysweeneyapp.ui.theme.navBarColor
import com.project.sydneysweeneyapp.ui.theme.navIconsActive
import com.project.sydneysweeneyapp.ui.theme.navIconsInactive

data class BottomNavItem(
	val label: String,
	val icon: ImageVector,
	val route: String
)

@Composable
fun BottomBar(navController: NavController) {
	val items = listOf(
		BottomNavItem(
			label = "Tap",
			icon = Icons.Default.Favorite,
			route = NavigationRoutes.TAP
		),
		BottomNavItem(
			label = "Treasury",
			icon = Icons.Default.Star,
			route = NavigationRoutes.TREASURY
		),
		BottomNavItem(
			label = "Missions",
			icon = Icons.Default.ShoppingCart,
			route = NavigationRoutes.MISSIONS
		),
		BottomNavItem(
			label = "Profile",
			icon = Icons.Default.AccountCircle,
			route = NavigationRoutes.PROFILE
		)
	)

	val navBackStackEntry by navController.currentBackStackEntryAsState()
	val currentRoute = navBackStackEntry?.destination?.route

	NavigationBar(
		containerColor = navBarColor,
	) {
		items.forEach { item ->
			NavigationBarItem(
				icon = {
					Icon(
						imageVector = item.icon,
						contentDescription = item.label
					)
				},
				label = {
					Text(text = item.label)
				},
				selected = currentRoute == item.route,
				onClick = {
					navController.navigate(item.route) {
						popUpTo(navController.graph.startDestinationId) {
							saveState = true
						}
						launchSingleTop = true
						restoreState = true
					}
				},
				colors = NavigationBarItemDefaults.colors(
					selectedIconColor = navIconsActive,
					unselectedIconColor = navIconsInactive,
					selectedTextColor = navIconsActive,
					unselectedTextColor = navIconsInactive,
					indicatorColor = Purple80,
				),
			)
		}
	}
}
