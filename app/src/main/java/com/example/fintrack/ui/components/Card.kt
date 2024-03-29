package com.example.fintrack.ui.components

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
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


    ) {
        Box(
            modifier = modifier
                .clip(RoundedCornerShape(15.dp))
                .background(Color(0xFF43454F))
                .width(327.dp)
                .height(150.dp)

        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,

                    ) {
                    Text(
                        text = "Jumlah uang sekarang",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFFFFFFFF),

                            )
                    )
                    Image(
                        imageVector = Icons.Default.MoreHoriz,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }

                Text(
                    text = "Rp. 70.000",
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = null,
                            Modifier
                                .padding(0.dp)
                                .width(25.dp)
                                .height(25.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Rp. 0",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = null,
                            Modifier
                                .padding(0.dp)
                                .width(25.dp)
                                .height(25.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Rp. 0",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
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
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
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
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
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
                .weight(1f)
//                .height(150.dp),
                .wrapContentHeight(),
            shape = RoundedCornerShape(
                15.dp,
                15.dp,
                10.dp,
                10.dp

            ), // Rounded corner atas, bawah lurus
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
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
                    overflow = TextOverflow.Clip,
                    maxLines = 2,
                    fontSize = 16.sp,
                    text = "Pengertian Investasi: Jeniswdwdwdwdwdwdwdwssssssss",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, end = 5.dp),
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
        Card(
            modifier = Modifier
                .weight(1f)
//                .height(150.dp),
                .wrapContentHeight(),
            shape = RoundedCornerShape(
                15.dp,
                15.dp,
                10.dp,
                10.dp

            ), // Rounded corner atas, bawah lurus
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
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
                    overflow = TextOverflow.Clip,
                    maxLines = 2,
                    fontSize = 16.sp,
                    text = "Pengertian Investasi: Jeniswdwdwdwdwdwdwdwssssssss",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, end = 5.dp),
                )
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }

}

@Composable
fun HomeCardEdukasi2(
    modifier: Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.LightGray
        ),
        modifier = modifier
            .fillMaxWidth()
            .width(153.dp)
            .height(43.dp),
        shape = RoundedCornerShape(7.dp)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp)
                .height(43.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                Modifier
                    .padding(0.dp)
                    .width(27.dp)
                    .height(27.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Asuransi", style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),

                    )
            )
        }
    }
}

@Composable
fun CardTabunganKondisi1(
    modifier: Modifier
) {
    Card(
        modifier = modifier
            .width(324.dp)
            .height(90.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(width = 1.dp, color = Color(0xFFD9D7DE))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                Modifier
                    .padding(0.dp)
                    .width(77.dp)
                    .height(57.dp)
            )
            Column {
                Text(
                    text = "Yuk, Rencanakan masa depan",

                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),

                        letterSpacing = 0.25.sp,
                    )
                )
                Text(
                    text = "Mulai buat rencana tabungan ",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 20.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF000000),
                        textDecoration = TextDecoration.Underline,
                        letterSpacing = 0.25.sp,
                    )
                )
            }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun CardPreview() {
//    BalanceCard(modifier = Modifier)
    Surface() {
        BalanceCard(modifier = Modifier.wrapContentHeight())
    }

}