package com.example.fintrack.ui.screen.auth

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R
import com.example.fintrack.ui.components.ButtonUtama
import com.example.fintrack.ui.components.NormalTextField
import com.example.fintrack.ui.components.PasswordField
import com.example.fintrack.ui.components.Plus_Jakarta_Sans

@Composable
fun RegisterScreen(onLoginClicked: (username: String, password: String) -> Unit){
    val context = LocalContext.current
    val focusManager = LocalFocusManager.current

    // State for holding username and password
    val usernameState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 43.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.fintrack_minlogo),
            contentDescription = "Logo",
            modifier = Modifier
                .width(162.dp)
                .height(67.dp)
            //contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(61.dp))
        Text(
            text = "Daftar Untuk Menuju Keuangan\nYang Lebih Baik",
            fontFamily = Plus_Jakarta_Sans,
            fontWeight = FontWeight(600),
            fontSize = 18.sp,
            color = Color(0xFF121417),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(26.dp))

        Column(
            modifier = Modifier
                .width(318.dp)
                .height(424.dp)
                .background(color = Color(0xFFF5F5F5), shape = RoundedCornerShape(size = 15.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//
        ) {
            Text(
                modifier = Modifier.padding(start = 110.dp, top = 15.dp, end= 110.dp),
                text = "Daftar Akun",
                fontFamily = Plus_Jakarta_Sans,
                fontWeight = FontWeight(700),
                fontSize = 16.sp,
                color = Color(0xFF121417),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(18.dp))

            Column(
                modifier =  Modifier
                    .padding(start = 14.dp, end = 14.dp)
            ) {
                NormalTextField(text = "Email")
                //  Spacer(modifier = Modifier.height(16.dp))
                PasswordField(text = "Password")
                PasswordField(text = "Konfirmasi Password")
                Spacer(modifier = Modifier.height(14.dp))
                //NormalTextField(text = "Halo")
                Row {
                    Text(
                        text = "Lupa Password?",
                        fontFamily = Plus_Jakarta_Sans,
                        fontWeight = FontWeight(700),
                        fontSize = 12.sp,
                        color = Color(0xFF121417)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    ClickableText(
                        modifier = Modifier.padding(top = 2.dp),
                        text = AnnotatedString("Reset Passsword"),
                        onClick = {
                            // Navigasi ke halaman berikutnya
                            // Misalnya:
                            // navController.navigate("next_page_route")
                        },
                        style = TextStyle(
                            fontFamily = Plus_Jakarta_Sans,
                            fontWeight = FontWeight(400),
                            fontSize = 12.sp,

                            color = Color(0xFF121417),
                            textDecoration = TextDecoration.Underline
                        )
                    )

                }
                Spacer(modifier = Modifier.height(24.dp))
                ButtonUtama(onClick = { /*TODO*/ }, text ="Daftar" )
                Spacer(modifier = Modifier.height(31.dp))


            }


        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ){
            Row {
                Text(
                    text = "Belum punya akun?",
                    fontFamily = Plus_Jakarta_Sans,
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                    color = Color(0xFF696B76)
                )
                Spacer(modifier = Modifier.width(2.dp))
                ClickableText(
                    modifier = Modifier.padding(top = 2.dp),
                    text = AnnotatedString("Daftar"),
                    onClick = {
                        // Navigasi ke halaman berikutnya
                        // Misalnya:
                        // navController.navigate("next_page_route")
                    },
                    style = TextStyle(
                        fontFamily = Plus_Jakarta_Sans,
                        fontWeight = FontWeight(700),
                        fontSize = 16.sp,

                        color = Color(0xFF696B76),

                        )
                )

            }
        }
    }
}

@Preview
@Composable
fun PreviewRegisterScreen(){
    RegisterScreen(onLoginClicked = { _, _ -> })
}
