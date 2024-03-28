package com.example.fintrack.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fintrack.R
import com.example.fintrack.ui.components.BalanceCard
import com.example.fintrack.ui.components.HomeCardTabungan
import com.example.fintrack.ui.components.HomeEdukasiCard


@Composable
fun HomeScreen(
//    name: String
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile Image",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column(modifier = Modifier) {
                    Text(text = "Bonjourr")
                    Text(text = "Rifqi Agustia")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            BalanceCard(
                modifier = Modifier

            )
            Spacer(modifier = Modifier.height(16.dp))

            Column(modifier = Modifier) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Tabungan")
                    Text(text = "Lihat Semua")
                }
                HomeCardTabungan()
            }
            Spacer(modifier = Modifier.height(16.dp))

            Column(modifier = Modifier) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Edukasi")
                    Text(text = "Lihat Semua")
                }
                HomeEdukasiCard()
            }
            Spacer(modifier = Modifier.height(16.dp))

            Column(modifier = Modifier) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Transaksi Terakhir")
                    Text(text = "Lihat Semua")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))




        }

    }


}


@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}