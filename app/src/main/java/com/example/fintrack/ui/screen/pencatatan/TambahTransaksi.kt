package com.example.fintrack.ui.screen.pencatatan

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TambahTransaksi (modifier: Modifier) {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Pemasukan", "Pengeluaran")

    Column(modifier.fillMaxWidth()) {
        TabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        when (tabIndex) {
            0 -> TambahPemasukanScreen(modifier = Modifier )
            1 -> TambahPengeluaranScreen(modifier = Modifier )
            else -> {}
        }
    }
}