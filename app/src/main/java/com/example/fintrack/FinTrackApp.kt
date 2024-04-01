package com.example.fintrack

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.fintrack.ui.navigation.NavGraph
import com.example.fintrack.ui.navigation.listofNavigationItem
import com.example.fintrack.ui.theme.FinTrackTheme

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun FinTrackApp() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            when (currentDestination) {
                "home" -> MainTopBar(topBarTitle = "Windah Barusadar", navController)
                "tabungan" -> SecondTopBar(title = "Tabungan")
                "transaction" -> SecondTopBar(title = "Tambah Transaksi")
                "edukasi" -> SecondTopBar(title = "Edukasi Keuangan")
                "riwayat" -> SecondTopBar(title = "Riwayat Transaksi")
                else -> SecondTopBar(title = "")


            }
        },
        bottomBar = {
            MainBottomBar(navHostController = navController)
        },
        floatingActionButton = {
        if(currentDestination == "tabungan") {
            FloatingActionButton(
                onClick = { /* Aksi ketika FAB diklik */ },
                containerColor = Color(0xFF07993C)
            ) {
                // Ikon untuk FAB, contoh menggunakan ikon penambahan
                Icon(Icons.Filled.Add, contentDescription = "Tambah Tabungan", tint = Color.White)
            }
        }
        }
    ) { paddingValues ->
        NavGraph(navController = navController, modifier = Modifier.padding(paddingValues))

    }
}

@Composable
fun MainBottomBar(navHostController: NavHostController) {

    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar(containerColor = Color.White, modifier = Modifier.border(1.dp, Color(0xFFD9D9D9))) {
        listofNavigationItem.forEachIndexed { _, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painterResource(id = item.icon) ,
                        contentDescription = item.title,
                        tint = if (currentDestination?.hierarchy?.any { it.route == item.route } == true) {
                            Color.Green
                        } else {
                            Color.Gray
                        },
                                modifier = Modifier.size(25.dp)
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(topBarTitle: String, navHostController: NavHostController) {


    TopAppBar(
        title = {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(11.dp))
                    Text(
                        text = topBarTitle,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF121417),
                        )
                    )
                }

            }
        },
        modifier = Modifier
            .border(width = 1.dp, color = Color(0xFFD9D9D9))
            .background(Color(0xFFFFFFFF))
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondTopBar(title: String) {
    TopAppBar(
        title = {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF121417),
                ), textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth()

            )

        },
        navigationIcon = {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back"
            )
        },
        modifier = Modifier
            .border(width = 1.dp, color = Color(0xFFD9D9D9))
            .background(Color(0xFFFFFFFF))

    )
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    FinTrackTheme {
//        MainTopBar(topBarTitle = "Windah Batubara")
    }
}