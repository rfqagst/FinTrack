package com.example.fintrack.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.fintrack.ui.screen.edukasi.KategoriEdukasiScreen
import com.example.fintrack.ui.screen.home.HomeScreen
import com.example.fintrack.ui.screen.pencatatan.TambahPengeluaranScreen
import com.example.fintrack.ui.screen.riwayat.RiwayatPengeluaranScreen
import com.example.fintrack.ui.screen.tabungan.ListTabunganScreen


@Composable
fun BottomNavGraph(navController: NavHostController,modifier: Modifier) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Tabungan.route) {
            ListTabunganScreen()
        }
        composable(route = BottomBarScreen.Transaksi.route) {
            TambahPengeluaranScreen()
        }
        composable(route = BottomBarScreen.Edukasi.route) {
            KategoriEdukasiScreen()
        }
        composable(route = BottomBarScreen.Riwayat.route) {
            RiwayatPengeluaranScreen()
        }
    }
}