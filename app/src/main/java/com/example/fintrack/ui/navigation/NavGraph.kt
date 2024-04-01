package com.example.fintrack.ui.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.fintrack.ui.screen.edukasi.KategoriEdukasiScreen
import com.example.fintrack.ui.screen.home.HomeScreen
import com.example.fintrack.ui.screen.pencatatan.TambahPengeluaranScreen
import com.example.fintrack.ui.screen.pencatatan.TambahTransaksi
import com.example.fintrack.ui.screen.riwayat.RiwayatPengeluaranScreen
import com.example.fintrack.ui.screen.riwayat.RiwayatTransaksi
import com.example.fintrack.ui.screen.tabungan.ListTabunganScreen


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen(modifier)
        }
        composable(route = BottomBarScreen.Tabungan.route) {
            ListTabunganScreen(modifier)
        }
        composable(route = BottomBarScreen.Transaksi.route) {
            TambahTransaksi(modifier)
        }
        composable(route = BottomBarScreen.Edukasi.route) {
            KategoriEdukasiScreen(modifier)
        }
        composable(route = BottomBarScreen.Riwayat.route) {
            RiwayatTransaksi(modifier)
        }
    }
}