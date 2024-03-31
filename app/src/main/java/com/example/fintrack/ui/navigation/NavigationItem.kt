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
    val icon: Int,
    val route: String
)

var listofNavigationItem = listOf(
    NavigationItem(
        route = "home",
        title = "Home",
        icon = R.drawable.home_icon_1
    ),
    NavigationItem(
        route = "tabungan",
        title = "Tabungan",
        icon = R.drawable.tabungan_icon_1
    ),
    NavigationItem(
        route = "transaction",
        title = "Catat",
        icon = R.drawable.transaksi_icon_1
    ),
    NavigationItem(
        route = "edukasi",
        title = "Edukasi",
        icon = R.drawable.edukasi_icon_1
    ),
    NavigationItem(
        route = "riwayat",
        title = "Riwayat",
        icon = R.drawable.riwayat_icon_1
    ),
)
