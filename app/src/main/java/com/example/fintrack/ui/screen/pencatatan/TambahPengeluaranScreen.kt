package com.example.fintrack.ui.screen.pencatatan

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TambahPengeluaranScreen() {

    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        ButtonUtama(onClick = { /*TODO*/ }, text = "Tambah Pengeluaran")

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color.LightGray)

        ) {
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState()).padding(16.dp),

                ) {
                NormalTextField(text = "Tanggal")
                NormalTextField(text = "Transaksi Apa?")
                NormalTextField(text = "Kategori Transaksi")
                NormalTextField(text = "Jenis Pembayaran")
                NormalTextField(text = "Nominal Transaksi")
                NormalTextField(text = "Keterangan Transaksi")
                Spacer(modifier = Modifier.height(24.dp))
                ButtonUtama(onClick = { /*TODO*/ }, text = "Tambah Pengeluaran")

            }
        }
        Spacer(modifier = Modifier.height(54.dp))
    }

}


@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showBackground = true)
fun PreviewTambah() {
    TambahPengeluaranScreen()
}