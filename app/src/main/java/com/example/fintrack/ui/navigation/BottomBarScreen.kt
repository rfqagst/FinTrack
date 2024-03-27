package com.example.fintrack.ui.navigation

import com.example.fintrack.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.outline_home_24
    )

    object Tabungan : BottomBarScreen(
        route = "tabungan",
        title = "Tabungan",
        icon = R.drawable.outline_savings_24
    )

    object Transaksi : BottomBarScreen(
        route = "transaction",
        title = "Transaction",
        icon = R.drawable.baseline_add_circle_24
    )

    object Edukasi : BottomBarScreen(
        route = "edukasi",
        title = "Edukasi",
        icon = R.drawable.outline_menu_book_24
    )

    object Riwayat : BottomBarScreen(
        route = "riwayat",
        title = "Riwayat",
        icon = R.drawable.baseline_history_24
    )
}