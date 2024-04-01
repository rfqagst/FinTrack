package com.example.fintrack.ui.screen.edukasi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R
import com.example.fintrack.ui.components.CardMainEdukasi

@Composable
fun KategoriEdukasiScreen(modifier: Modifier) {
    Column(
        modifier
            .padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Manajemen Keuangan",
                style = TextStyle(
                    fontSize = 21.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF121417),
                )
            )
            Text(
                text = "Semua", fontSize = 16.sp, color = Color(0xFF07993C),
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight(700)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CardMainEdukasi(
                modifier = Modifier
                    .weight(1f),
                image = painterResource(id = R.drawable.manajemen_image2),
                teks = "Apa Itu Money Management dan Strateginya"

            )

            Spacer(modifier = Modifier.width(16.dp))
            CardMainEdukasi(
                modifier = Modifier
                    .weight(1f),
                image = painterResource(id = R.drawable.management_image),
                teks = "Membangun Anggaran yang Realistis"
            )
        }

Spacer(modifier = Modifier.height(11.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Investasi",
                style = TextStyle(
                    fontSize = 21.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF121417),
                )
            )
            Text(
                text = "Semua", fontSize = 16.sp, color = Color(0xFF07993C),
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight(700)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CardMainEdukasi(
                modifier = Modifier
                    .weight(1f),
                image = painterResource(id = R.drawable.investasi_image1),
                teks = "Pengertian Investasi: Jenis,Manfaat, dan Risikonya"
            )
            Spacer(modifier = Modifier.width(16.dp))
            CardMainEdukasi(
                modifier = Modifier
                    .weight(1f),
                image = painterResource(id = R.drawable.investasi_image2),
                teks = "Berinvestasi, Sekarang atau Nanti?"
            )
        }

        Spacer(modifier = Modifier.height(11.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Asuransi",
                style = TextStyle(
                    fontSize = 21.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF121417),
                )
            )
            Text(
                text = "Semua", fontSize = 16.sp, color = Color(0xFF07993C),
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight(700)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CardMainEdukasi(
                modifier = Modifier
                    .weight(1f),
                image = painterResource(id = R.drawable.asuransi_image),
                teks = "Asuransi Jiwa: Perlindungan untuk Masa Depan"
            )
            Spacer(modifier = Modifier.width(16.dp))
            CardMainEdukasi(
                modifier = Modifier
                    .weight(1f),
                image = painterResource(id = R.drawable.asuransi_image2),
                teks = "Mengenal Asuransi Syariah: Prinsip dan Keuntungannya"
            )
        }
    }
}