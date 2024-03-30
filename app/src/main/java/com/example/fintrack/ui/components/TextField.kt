package com.example.fintrack.ui.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fintrack.R


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NormalTextField(
    text: String,
) {
    Column() {
        var normalText by rememberSaveable {
            mutableStateOf("")
        }
        Text(
            text = text, style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF121417),
            )
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            value = normalText,
            onValueChange = {
                normalText = it
            },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF1BE063),
                unfocusedBorderColor = Color(0xFF949398),
            ),
            textStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight(400)),
            shape = RoundedCornerShape(10.dp),
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownField(text: String) {
    val listPembayaran = listOf("Cash", "Debit", "E-Wallet")
    val listKategoriPengeluaran =
        listOf("Hiburan", "Makanan", "Pendidikan", "Obat-Obatan", "Kosmetik")
    val listKategoriPemasukan = listOf("Gaji", "Pemberian", "Dana Pensiun")

    var isExpanded by remember {
        mutableStateOf(false)
    }
    var selectedPembayaran by remember { mutableStateOf(listPembayaran[0]) }

    Column {
        Text(
            text = text, style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF121417),
            )
        )
        Spacer(modifier = Modifier.height(6.dp))


        ExposedDropdownMenuBox(
            expanded = isExpanded,
            onExpandedChange = { isExpanded = !isExpanded }) {

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .menuAnchor(),
                value = selectedPembayaran,
                onValueChange = { },
                readOnly = true,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF1BE063),
                    unfocusedBorderColor = Color(0xFF949398),
                ),
                textStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight(400)),
                shape = RoundedCornerShape(10.dp),
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) }


            )

            ExposedDropdownMenu(expanded = isExpanded, onDismissRequest = { isExpanded = false }) {
                listPembayaran.forEachIndexed { index, text ->
                    DropdownMenuItem(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(color = Color(0xFFFFFFFF)),
                        text = { Text(text = text, style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight(400))) },
                        onClick = {
                            selectedPembayaran = listPembayaran[index]
                            isExpanded = false

                        },
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding

                    )
                }

            }
        }


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
    DropDownField(text = "Pilih Metode Pembayaran")//    PasswordField("Password")
}