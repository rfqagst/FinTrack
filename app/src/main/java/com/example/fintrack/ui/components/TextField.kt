package com.example.fintrack.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R

@Composable
fun NormalTextField(
    text: String,
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        var normalText by rememberSaveable {
            mutableStateOf("")
        }
        Text(text = text, fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(

            value = normalText,
            onValueChange = {
                normalText = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
            ,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF1BE063),
                unfocusedBorderColor = Color(0xFFAFAEB3),
            ),
            shape = RoundedCornerShape(10.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@Composable
fun PasswordField(
    text: String
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        var password by rememberSaveable {
            mutableStateOf("")
        }

        var passwordVisibility by remember {
            mutableStateOf(false)
        }

        val icon = if (passwordVisibility)
            painterResource(id = R.drawable.baseline_visibility_24)
        else
            painterResource(id = R.drawable.baseline_visibility_off_24)


        Text(text = "Password")
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier
                .height(45.dp)
                .width(290.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                focusedBorderColor = Color(0xFFAFAEB3),
                unfocusedBorderColor = Color(0xFF1BE063),

                ),
            shape = RoundedCornerShape(10.dp),
            trailingIcon = {
                IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                    Icon(
                        painter = icon,
                        contentDescription = "vis"
                    )
                }
            },
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation()


        )
    }
}


@Preview(showBackground = true)
@Composable
fun PrevDefault() {
    NormalTextField("Email")
//    PasswordField("Password")
}