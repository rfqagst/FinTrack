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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R
import com.example.fintrack.ui.components.BalanceCard
import com.example.fintrack.ui.components.CardTabunganKondisi1
import com.example.fintrack.ui.components.HomeCardEdukasi2
import com.example.fintrack.ui.components.HomeCardTabungan
import com.example.fintrack.ui.components.HomeEdukasiCard


@Composable
fun HomeScreen(
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier, verticalArrangement = Arrangement.Center) {
                Text(text = "Bonjou", fontSize = 18.sp)
                Text(text = "Rifqi Agustia", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }
        Spacer(modifier = Modifier.height(31.dp))

        BalanceCard(
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(text = "Tabungan", fontSize = 21.sp, fontWeight = FontWeight.Bold)
                Text(text = "Lihat Semua", fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(11.dp))
            CardTabunganKondisi1(modifier = Modifier.fillMaxWidth())
        }
        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Edukasi", fontSize = 21.sp, fontWeight = FontWeight.Bold)
                Text(text = "Lihat Semua", fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(11.dp))
            Row {
                HomeCardEdukasi2(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f))
                Spacer(modifier = Modifier.width(16.dp))
                HomeCardEdukasi2(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f))
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row {
                HomeCardEdukasi2(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f))
                Spacer(modifier = Modifier.width(16.dp))
                HomeCardEdukasi2(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f))
            }

        }
        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Transaksi Terakhir", fontSize = 21.sp, fontWeight = FontWeight.Bold)
                Text(text = "Lihat Semua", fontSize = 16.sp)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))


    }


}


@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}