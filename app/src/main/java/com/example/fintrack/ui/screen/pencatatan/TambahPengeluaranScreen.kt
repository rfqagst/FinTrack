package com.example.fintrack.ui.screen.pencatatan

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fintrack.ui.components.ButtonUtama
//import com.example.fintrack.ui.components.DropDownField
import com.example.fintrack.ui.components.NormalTextField

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TambahPengeluaranScreen(modifier: Modifier) {
    Column(
        modifier
            .padding(16.dp)
            .fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color(0xFFFFFFFF)),
            contentAlignment = Alignment.Center

        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),

                ) {
                NormalTextField(text = "Tanggal")
                NormalTextField(text = "Transaksi Apa?")
                NormalTextField(text = "Kategori Transaksi")
                //DropDownField(text = "Jenis Pembayaran")
                NormalTextField(text = "Nominal Transaksi")
                NormalTextField(text = "Keterangan Transaksi")
                Spacer(modifier = Modifier.height(24.dp))
                ButtonUtama(onClick = { /*TODO*/ }, text = "Tambah Pengeluaran")

            }
        }
        Spacer(modifier = Modifier.height(54.dp))
    }

}


//@RequiresApi(Build.VERSION_CODES.O)
//@Composable
//fun TabScreen() {
//    var tabIndex by remember { mutableStateOf(0) }
//
//    val tabs = listOf("Pemasukan", "Pengeluaran")
//
//    Column(modifier = Modifier.fillMaxWidth()) {
//        TabRow(selectedTabIndex = tabIndex) {
//            tabs.forEachIndexed { index, title ->
//                Tab(
//                    text = { Text(title) },
//                    selected = tabIndex == index,
//                    onClick = { tabIndex = index }
//                )
//            }
//        }
//        when (tabIndex) {
//            0 -> TambahPengeluaranScreen(modifier = )
//            1 -> TambahPemasukanScreen()
//            else -> {} // Handle other cases, if any
//        }
//    }
//}


@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showBackground = true)
fun PreviewTambah() {
//    TabScreen(modifier = Modifier)
}