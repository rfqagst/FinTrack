package com.example.fintrack.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R


@Composable
fun BalanceCard(
    modifier: Modifier
) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .clip(RoundedCornerShape(15.dp))
            .background(Color(0xFF1BE564)),


        ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier,
            ) {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Text(text = "Jumlah uang sekarang")
                        Image(
                            painter = painterResource(id = R.drawable.baseline_more_horiz_24),
                            contentDescription = null
                        )
                    }

                    Text(text = "Rp. 70.000")
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Column {
                        Text(text = "Pemasukan")
                        Text(text = "Rp. 0")
                    }
                    Column {
                        Text(text = "Pengeluaran")
                        Text(text = "Rp. 0")
                    }
                }
            }
        }
    }
}

@Composable
fun HomeCardTabungan(
) {
    Row(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Card(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize(),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF43454F)
            )

        ) {

            Box(modifier = Modifier.fillMaxWidth()) {
                Image(

                    painter = painterResource(id = R.drawable.vector22),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 50.dp)
                        .alpha(0.15f)

                )

                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize()
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        modifier = Modifier
                            .width(45.dp)
                            .height(45.dp),
                        painter = painterResource(id = R.drawable.baseline_add_circle_24),
                        contentDescription = null

                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Tambah Tabungan",
                        style = TextStyle(fontSize = 15.sp, color = Color.White)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.width(16.dp))
        Card(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize(),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF43454F)
            )

        ) {

            Box(modifier = Modifier.fillMaxWidth()) {
                Image(

                    painter = painterResource(id = R.drawable.vector22),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 50.dp)
                        .alpha(0.15f)

                )

                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize()
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        modifier = Modifier
                            .width(45.dp)
                            .height(45.dp),
                        painter = painterResource(id = R.drawable.baseline_add_circle_24),
                        contentDescription = null

                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Tambah Tabungan",
                        style = TextStyle(fontSize = 15.sp, color = Color.White)
                    )
                }
            }
        }

    }
}


@Composable
fun HomeEdukasiCard() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp) // Spasi antara dua card
    ) {
        Card(
            modifier = Modifier
                .padding(0.dp)
                .weight(1f) // Memberikan bobot yang sama pada kedua card
                .height(150.dp), // Atur ketinggian card sesuai kebutuhan
            shape = RoundedCornerShape(
                15.dp,
                15.dp,
                10.dp,
                10.dp

            ), // Rounded corner atas, bawah lurus
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    contentScale = ContentScale.FillWidth,
                    painter = painterResource(id = R.drawable.assurance),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16f / 9f)
                        .clip(
                            RoundedCornerShape(
                                15.dp,
                                15.dp,
                                0.dp,
                                0.dp
                                )
                        )
                )
                Spacer(modifier = Modifier.height(6.dp)) // Spasi antara gambar dan teks
                Text(
                    text = "Pengertian Investasi: Jenis",
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
        Card(
            modifier = Modifier
                .padding(0.dp)
                .weight(1f) // Memberikan bobot yang sama pada kedua card
                .height(150.dp), // Atur ketinggian card sesuai kebutuhan
            shape = RoundedCornerShape(
                15.dp,
                15.dp,
                10.dp,
                10.dp

                )
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    contentScale = ContentScale.FillWidth,
                    painter = painterResource(id = R.drawable.assurance),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(16f / 9f)
                        .clip(
                            RoundedCornerShape(
                                15.dp,
                                15.dp,
                                0.dp,
                                0.dp
                            )
                        )
                )
                Spacer(modifier = Modifier.height(6.dp)) // Spasi antara gambar dan teks
                Text(
                    text = "Pengertian Investasi: Jenis",
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }

}


@Composable
@Preview(showBackground = true)
fun CardPreview() {
//    BalanceCard(modifier = Modifier)
    Surface(modifier = Modifier.fillMaxSize()) {
        HomeEdukasiCard()
    }

}