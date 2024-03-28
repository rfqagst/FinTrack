package com.example.fintrack.ui.screen.pencatatan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fintrack.ui.components.ButtonUtama
import com.example.fintrack.ui.components.NormalTextField

@Composable
fun TambahPemasukanScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // Mengaktifkan scrolling
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .background(Color.LightGray)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                NormalTextField(text = "Tanggal")
                NormalTextField(text = "Transaksi Apa?")
                NormalTextField(text = "Kategori Pemasukan")
                NormalTextField(text = "Jenis Pembayaran")
                NormalTextField(text = "Nominal Pemasukan")
                NormalTextField(text = "Keterangan Transaksi")
                NormalTextField(text = "Keterangan Transaksi")
                NormalTextField(text = "Keterangan Transaksi")
                NormalTextField(text = "Keterangan Transaksi")
                ButtonUtama(onClick = { /*TODO*/ }, text = "Tambah Pemasukan")
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewTambahPemasukanScreen() {
    TambahPemasukanScreen()
}