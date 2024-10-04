package com.example.appplayerbetta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.appplayerbetta.ui.MyApp
import com.example.appplayerbetta.ui.theme.AppPlayerBettaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppPlayerBettaTheme {
                MyApp()
            }
        }
    }
}
