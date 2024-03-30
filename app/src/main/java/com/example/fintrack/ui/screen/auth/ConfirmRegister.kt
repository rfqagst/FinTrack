package com.example.fintrack.ui.screen.auth


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R
import com.example.fintrack.ui.components.ButtonUtama
import com.example.fintrack.ui.components.Plus_Jakarta_Sans

@Composable
fun ConfirmRegister(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 36.dp, end = 36.dp)
    ) {
        Image(
            modifier = Modifier

                .padding(top = 212.dp),
            painter = painterResource(id = R.drawable.check_circle), contentDescription = "image description", contentScale = ContentScale.None
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            modifier = Modifier.padding(start = 64.dp, top = 15.dp, end= 64.dp),
            text = "Berhasil mendaftar akun",
            fontFamily = Plus_Jakarta_Sans,
            fontWeight = FontWeight(700),
            fontSize = 16.sp,
            color = Color(0xFF121417),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            modifier = Modifier.padding(start = 32.dp, end= 32.dp),
            text = "windahbatubara@gmail.com",
            fontFamily = Plus_Jakarta_Sans,
            fontWeight = FontWeight(400),
            fontSize = 16.sp,
            color = Color(0xFF121417),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(152.dp))
        ButtonUtama(onClick = { /*TODO*/ }, text ="Masuk    " )

    }
}

@Preview
@Composable
fun PreviewConfirmRegiter(){
    ConfirmRegister()
}