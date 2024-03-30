package com.example.fintrack.ui.screen.tabungan

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fintrack.ui.components.ButtonUtama
import com.example.fintrack.ui.components.NormalTextField

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TambahTabunganScreen() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color(0xFFFFFFFF)),
            contentAlignment = Alignment.Center

        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),

                ) {
                NormalTextField(text = "Nama Tabungan")
                NormalTextField(text = "Nominal Target Tabungan")
                NormalTextField(text = "Kapan mau Tercapai")
                Spacer(modifier = Modifier.height(24.dp))
                ButtonUtama(onClick = { /*TODO*/ }, text = "Tambah Target Tabungan")

            }
        }
        Spacer(modifier = Modifier.height(54.dp))
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showBackground = true)
fun PreviewTambah() {
    TambahTabunganScreen()
}