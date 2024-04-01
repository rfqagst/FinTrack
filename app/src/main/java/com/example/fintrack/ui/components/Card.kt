package com.example.fintrack.ui.components

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R
import com.example.fintrack.ui.theme.FinTrackTheme


@Composable
fun BalanceCard(
    modifier: Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(15.dp))
            .background(Color(0xFF43454F))
            .fillMaxWidth()
            .height(150.dp)

    ) {
        Image(
            painter = painterResource(id = R.drawable.monetization),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterEnd),
            alpha = 0.25f
        )
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
            Image(painter = painterResource(id = R.drawable.line), contentDescription = null)
            Spacer(modifier = Modifier.height(16.dp))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,

                ) {
                Row(
                    modifier = Modifier,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arrow_up),
                        contentDescription = null,
                        Modifier
                            .padding(0.dp)
                            .width(25.dp)
                            .height(25.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Rp. 70.000",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))
                Row(
                    modifier = Modifier
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arrow_down),
                        contentDescription = null,
                        Modifier
                            .padding(0.dp)
                            .width(25.dp)
                            .height(25.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Rp. 70.000",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

            }
        }
    }

}

@Composable
fun HomeCardEdukasi(
    modifier: Modifier,
    image: Painter,
    title: String
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
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
                painter = image,
                contentDescription = null,
                Modifier
                    .padding(0.dp)
                    .width(27.dp)
                    .height(27.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = title, style = TextStyle(
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
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.babi),
                contentDescription = null,
                Modifier
                    .width(77.dp)
                    .height(57.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
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
fun CardTransaksi(
    modifier: Modifier, image: Painter, title: String, pembayaran: String, nominal: String
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
        modifier = modifier,
        shape = RoundedCornerShape(7.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Row() {
                Image(
                    painter = image,
                    contentDescription = null,
                    Modifier
                        .padding(0.dp)
                        .width(35.dp)
                        .height(35.dp)
                )

                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = title,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF121417),
                        )
                    )

                    Text(
                        text = pembayaran,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF121417),

                            )
                    )
                }

            }
            Text(
                text = nominal,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFFD83535),

                    )
            )
        }
        Image(painter = painterResource(id = R.drawable.line2), contentDescription = null)
    }
}


@Composable
fun CardTabunganKondisi2(modifier: Modifier) {
    Card(
        modifier = modifier,
        border = BorderStroke(
            width = 1.dp,
            color = Color(0xFFBEBEBE)
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF),
        ),

        ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Text(
                    text = "Macbook",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF43454F),
                    )
                )
            }
            Text(
                text = "Rp. 33.000 ",
                style = TextStyle(
                    fontSize = 26.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF43454F),
                )
            )
            Row {
                Text(
                    text = "Target",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF43454F),
                    )
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Rp. 12.000.000",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF43454F)
                    )
                )
            }
        }
    }
}

@Composable
fun CardBannerTabungan(modifier: Modifier) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(15.dp))
            .background(Color(0xFF43454F))
            .fillMaxWidth()
            .height(150.dp)

    ) {
        Image(
            painter = painterResource(id = R.drawable.monetization),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterEnd),
            alpha = 0.25f
        )
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.logobabi2),
                contentDescription = null,
                modifier = Modifier
                    .width(76.dp)
                    .height(74.dp)
            )
            Column(horizontalAlignment = Alignment.End) {
                Text(
                    text = "Total Akumulasi Tabungan",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                    )
                )
                Spacer(modifier = Modifier.height(6.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Rp. 20.383",
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Text(
                        text = ".000",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                        ),
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))
            }

        }
    }
}

@Composable
fun CardMainEdukasi(modifier: Modifier, image: Painter, teks : String) {
    Column(
        modifier
            .clip(RoundedCornerShape(10.dp))
    ) {
        Image(
            painter = image,
            contentDescription = null,
        )
        Box(
            modifier = Modifier
                .background(Color.White)
                .clip(RoundedCornerShape(5.dp))
        ) {
            Text(
                text = teks,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF121417),
                    ),
                maxLines = 2,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CardPreview() {
//    BalanceCard(modifier = Modifier)
    FinTrackTheme() {
//        CardMainEdukasi(
//            image = painterResource(id = R.drawable.asuransi_image),
//            modifier = Modifier
//        )
    }

}