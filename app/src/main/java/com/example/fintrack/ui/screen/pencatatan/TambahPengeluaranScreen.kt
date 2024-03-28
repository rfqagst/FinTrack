package com.example.fintrack.ui.screen.pencatatan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fintrack.ui.components.ButtonUtama
import com.example.fintrack.ui.components.NormalTextField

@Composable
fun TambahPengeluaranScreen() {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(8.dp))
            .fillMaxWidth()
            .background(Color.LightGray)
            .verticalScroll(rememberScrollState()),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            NormalTextField(text = "Tanggal")
            NormalTextField(text = "Transaksi Apa?")
            NormalTextField(text = "Kategori Transaksi")
            NormalTextField(text = "Jenis Pembayaran")
            NormalTextField(text = "Nominal Transaksi")
            NormalTextField(text = "Keterangan Transaksi")
            NormalTextField(text = "Keterangan Transaksi")
            NormalTextField(text = "Keterangan Transaksi")
            NormalTextField(text = "Keterangan Transaksi")
            NormalTextField(text = "Keterangan Transaksi")
            Spacer(modifier = Modifier.height(24.dp))
            ButtonUtama(onClick = { /*TODO*/ }, text = "Tambah Pengeluaran" )
        }
        Spacer(modifier = Modifier.height(54.dp))
    }

}


@Composable
@Preview(showBackground = true)
fun PreviewTambah() {
    TambahPengeluaranScreen()
}