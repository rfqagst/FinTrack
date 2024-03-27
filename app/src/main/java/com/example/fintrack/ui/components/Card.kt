package com.example.fintrack.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
        modifier = modifier
            .padding(16.dp)
//            .width(327.dp)
            .height(150.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .background(Color(0xFF1BE564))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
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
    modifier: Modifier
) {
    Row(
        modifier = modifier
            .padding(16.dp)
            .height(130.dp)
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

//        Box(
//            modifier = Modifier
//                .weight(1f)
//                .background(Color(0xFF43454F))
//                .clip(RoundedCornerShape(15.dp))
//        ) {
//            Row(
//                modifier = Modifier.fillMaxSize(),
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.baseline_add_circle_24),
//                    contentDescription = null
//                )
//            }
//        }
//
//        Box(
//            modifier = Modifier
//                .weight(1f)
//                .background(Color(0xFFAFAEB3))
//                .clip(RoundedCornerShape(15.dp))
//        ) {
//            Row(
//                modifier = Modifier.fillMaxSize(),
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.baseline_more_horiz_24),
//                    contentDescription = null
//                )
//            }
//        }
//    }

}


@Composable
@Preview(showBackground = true)
fun CardPreview() {
    HomeCardTabungan(modifier = Modifier)
}