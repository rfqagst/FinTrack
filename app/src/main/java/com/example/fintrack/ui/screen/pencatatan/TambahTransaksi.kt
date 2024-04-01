package com.example.fintrack.ui.screen.pencatatan

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TambahTransaksi(modifier: Modifier) {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Pemasukan", "Pengeluaran")

    Column(modifier.fillMaxWidth()) {
        TabRow(
            selectedTabIndex = tabIndex,
            containerColor = Color(0xFF949398)
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = {
                        Text(
                            title,
                            color = if (tabIndex == index) Color.White else Color.White
                        )
                    },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White,
                    modifier = Modifier.background(
                        if (tabIndex == index) Color(0xFF07993C) else Color(
                            0xFF949398
                        )
                    ) // Warna latar belakang tab saat dipilih atau tidak dipilih
                )
            }
        }
        when (tabIndex) {
            0 -> TambahPemasukanScreen(modifier = Modifier)
            1 -> TambahPengeluaranScreen(modifier = Modifier)
            else -> {}
        }
    }
}