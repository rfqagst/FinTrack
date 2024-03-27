package com.example.fintrack

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.fintrack.ui.navigation.BottomNavGraph
import com.example.fintrack.ui.navigation.listofNavigationItem

@Composable
fun FinTrackApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomBar(navHostController = navController)
        }
    ) { paddingValues ->
        BottomNavGraph(navController = navController, modifier = Modifier.padding(paddingValues))
    }
}

@Composable
fun BottomBar(navHostController: NavHostController) {

    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar {
        listofNavigationItem.forEachIndexed { _, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = if (currentDestination?.hierarchy?.any { it.route == item.route } == true) {
                            Color.Green
                        } else {
                            Color.Gray
                        }
                    )
                },
                label = { Text(item.title) },
                selected = currentDestination?.hierarchy?.any {
                    it.route == item.route
                } == true,
                onClick = { navHostController.navigate(item.route) }
            )

        }
    }
}