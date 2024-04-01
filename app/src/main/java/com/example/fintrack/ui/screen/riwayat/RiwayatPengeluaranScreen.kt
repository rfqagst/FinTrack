package com.example.fintrack.ui.screen.riwayat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R
import com.example.fintrack.ui.components.CardTransaksi

@Composable
fun RiwayatPengeluaranScreen(modifier: Modifier) {
    Column(modifier.padding(16.dp)) {
        Text(text = "Transaksi Terakhir", fontSize = 21.sp, fontWeight = FontWeight(700))
        Spacer(modifier = Modifier.height(8.dp))
        CardTransaksi(
            modifier = Modifier.fillMaxWidth(),
            image = painterResource(id = R.drawable.arrow_down),
            title = "Tiket Konser JKT48",
            nominal = "Rp. 600.000",
            pembayaran = "Cash"
            , colorNominal = 0xFFD83535
        )
        CardTransaksi(
            modifier = Modifier.fillMaxWidth(),
            image = painterResource(id = R.drawable.arrow_down),
            title = "dipalak Rehan",
            nominal = "Rp. 50.000",
            pembayaran = "Cash"
            , colorNominal = 0xFFD83535
        )
        CardTransaksi(
            modifier = Modifier.fillMaxWidth(),
            image = painterResource(id = R.drawable.arrow_down),
            title = "Bayar kos",
            nominal = "Rp. 600.000",
            pembayaran = "Cash"
            , colorNominal = 0xFFD83535
        )
        CardTransaksi(
            modifier = Modifier.fillMaxWidth(),
            image = painterResource(id = R.drawable.arrow_down),
            title = "Sawer Vtuber",
            nominal = "Rp. 1.000.000",
            pembayaran = "Cash"
            , colorNominal = 0xFFD83535
        )

    }
}