package com.example.fintrack.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Savings
import androidx.compose.material.icons.outlined.School
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.fintrack.R

data class NavigationItem(
    val title: String,
    val icon: ImageVector,
    val route: String
)

var listofNavigationItem = listOf(
    NavigationItem(
        route = "home",
        title = "Home",
        icon = Icons.Outlined.Home
    ),
    NavigationItem(
        route = "tabungan",
        title = "Tabungan",
        icon = Icons.Outlined.Savings
    ),
    NavigationItem(
        route = "transaction",
        title = "Catat",
        icon = Icons.Filled.AddCircle
    ),
    NavigationItem(
        route = "edukasi",
        title = "Edukasi",
        icon = Icons.Outlined.School
    ),
    NavigationItem(
        route = "riwayat",
        title = "Riwayat",
        icon = Icons.Outlined.History
    ),
)
