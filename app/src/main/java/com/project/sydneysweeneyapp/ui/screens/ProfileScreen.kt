package com.project.sydneysweeneyapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.project.sydneysweeneyapp.ui.theme.primaryBackground

@Composable
fun ProfileScreen() {
	Box(
		modifier = Modifier
            .fillMaxSize()
            .background(primaryBackground),
	)
}
