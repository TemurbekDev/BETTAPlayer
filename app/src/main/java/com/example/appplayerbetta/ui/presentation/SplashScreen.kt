package com.example.appplayerbetta.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.appplayerbetta.R

@Preview
@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Первый слой: белый фон
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        )

        // Второй слой: изображение, центрированное
        Image(
            painter = painterResource(id = R.drawable.betta_slash_screen),
            contentDescription = "Music Player Icon",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}