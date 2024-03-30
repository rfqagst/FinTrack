package com.example.fintrack.ui.screen.tabungan

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R
import com.example.fintrack.ui.components.CardBannerTabungan
import androidx.compose.ui.text.*
import com.example.fintrack.ui.components.CardTabunganKondisi2

@Composable
fun ListTabunganScreen() {
    Column(Modifier.padding(16.dp)) {
        CardBannerTabungan(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(26.dp))
        Image(painter = painterResource(id = R.drawable.line2), contentDescription = null, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(26.dp))
        Text(
            text = "List Tabungan Aktif",
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
            )
        )
        Spacer(modifier = Modifier.height(21.dp))
        CardTabunganKondisi2(modifier = Modifier.fillMaxWidth())
    }

}

