package com.example.fintrack.ui.screen.pencatatan

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fintrack.ui.components.ButtonUtama
import com.example.fintrack.ui.components.NormalTextField

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TambahPemasukanScreen(modifier: Modifier) {
    Column(
        modifier
            .padding(16.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color(0xFFFFFFFF)),

        ) {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
                    .padding(16.dp),

                ) {
                NormalTextField(text = "Tanggal")
                NormalTextField(text = "Transaksi Apa?")
                NormalTextField(text = "Kategori Pendapatan")
                NormalTextField(text = "Jenis Pembayaran")
                NormalTextField(text = "Nominal Pendapatan")
                NormalTextField(text = "Keterangan Pendapatan")
                Spacer(modifier = Modifier.height(24.dp))
                ButtonUtama(onClick = { /*TODO*/ }, text = "Tambah Pemasukan", modifier = Modifier.fillMaxWidth())

            }
        }
        Spacer(modifier = Modifier.height(54.dp))
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showBackground = true)
fun PreviewTambahPemasukanScreen() {
//    TambahPemasukanScreen()
}