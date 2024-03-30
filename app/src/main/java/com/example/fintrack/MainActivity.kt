package com.example.fintrack

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.fintrack.ui.screen.home.HomeScreen
import com.example.fintrack.ui.screen.pencatatan.TambahPemasukanScreen
import com.example.fintrack.ui.screen.pencatatan.TambahPengeluaranScreen
import com.example.fintrack.ui.theme.FinTrackTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinTrackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF6F8FB)
                ) {
                    TambahPengeluaranScreen()
                }
            }
        }
    }
}

