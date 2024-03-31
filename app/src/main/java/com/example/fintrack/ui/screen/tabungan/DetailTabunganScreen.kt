package com.example.fintrack.ui.screen.tabungan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R
import com.example.fintrack.ui.components.ButtonUtama

@Composable
fun DetailTabunganScreen() {


    Column(
        modifier = Modifier
            .padding(16.dp)
        .fillMaxSize()
            .fillMaxWidth()
            .wrapContentWidth()
            .wrapContentHeight()
            .background(color = Color(0xFFFFFFFF)) // Ganti dengan warna yang berbeda seperti Color.Red

        ) {
        Column(
            modifier = Modifier
                .border(width = 1.dp, color = Color(0xFFBEBEBE), shape = RoundedCornerShape(10.dp)),

            ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Total yang sudah terkumpul :",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF000000),
                    ),
                )
                Text(
                    text = "Target : Rp. 12.000.000",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,
                    )
                )
            }

            Divider(color = Color(0xFFBEBEBE), thickness = 1.dp)


            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Mau nabung berapa hari ini?",
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF121417),
                        textAlign = TextAlign.Center,
                    )
                )
                ButtonUtama(
                    onClick = { /*TODO*/ },
                    text = "Catat",
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Divider(color = Color(0xFFBEBEBE), thickness = 1.dp)

            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Ingin tercapai sesuai target waktu? ",
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    )
                )
                Text(
                    text = "Uang yang harus disimpan ditabung :",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF121417),
                    )
                )
                Row {
                    Text(
                        text = "Rp. 33.000",
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontWeight = FontWeight(700),
                            color = Color(0xFF07993C),
                            textAlign = TextAlign.Center,
                        )
                    )
                    Row {
                        Text(
                            text = "Hari",
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight(700),
                                color = Color(0xFF121417),
                            )
                        )
                        Image(
                            painter = painterResource(id = R.drawable.baseline_keyboard_arrow_down_24),
                            contentDescription = null
                        )
                    }
                }

            }
        }
    }
}