package com.example.fintrack.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonUtama(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {

    androidx.compose.material3.Button(
        onClick = onClick,
        modifier = modifier
            .padding(vertical = 8.dp)
            .height(50.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF1BE564), // Atur warna latar belakang
            contentColor = Color(0xFF121417) // Atur warna teks
        ),
    ) {
        Text(text = text, fontSize = 18.sp)
    }
}


@Composable
fun TabLayoutButton () {

}

@Composable
@Preview(showBackground = true)
fun PreviewBtn() {
    ButtonUtama(onClick = { /*TODO*/ }, text = "Login")
}