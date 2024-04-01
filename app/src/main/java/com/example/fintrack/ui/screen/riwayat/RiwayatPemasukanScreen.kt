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
fun RiwayatPemasukanScreen(modifier: Modifier) {

    Column(modifier.padding(16.dp)) {
        Text(text = "Transaksi Terakhir", fontSize = 21.sp, fontWeight = FontWeight(700))
        Spacer(modifier = Modifier.height(8.dp))
        CardTransaksi(
            modifier = Modifier.fillMaxWidth(),
            image = painterResource(id = R.drawable.arrow_up),
            title = "Gaji pertama euy",
            nominal = "Rp. 1.600.000",
            pembayaran = "Cash",
            colorNominal = 0xFF07993C
        )
        CardTransaksi(
            modifier = Modifier.fillMaxWidth(),
            image = painterResource(id = R.drawable.arrow_up),
            title = "Giveaway JessNoLimit",
            nominal = "Rp. 69.000",
            pembayaran = "Cash",
            colorNominal = 0xFF07993C
        )
        CardTransaksi(
            modifier = Modifier.fillMaxWidth(),
            image = painterResource(id = R.drawable.arrow_up),
            title = "Nemu",
            nominal = "Rp. 11.600.000",
            pembayaran = "Cash",
            colorNominal = 0xFF07993C
        )
        CardTransaksi(
            modifier = Modifier.fillMaxWidth(),
            image = painterResource(id = R.drawable.arrow_up),
            title = "Dikasih rehan tadi",
            nominal = "Rp. 20.000",
            pembayaran = "Cash",
            colorNominal = 0xFF07993C
        )
    }

}