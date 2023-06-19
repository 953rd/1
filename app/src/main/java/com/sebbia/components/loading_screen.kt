package com.sebbia.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sebbia.R

@Preview (showBackground = true)
@Composable
fun loading_screen() {
    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "im1",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds)
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,)
    {
        Image(painter = painterResource(id = R.drawable.logo2),
            contentDescription = "im2")
    }
}
