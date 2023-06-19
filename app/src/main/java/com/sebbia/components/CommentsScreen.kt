package com.sebbia.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController


import com.sebbia.R

@Composable
fun CommentsScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            ToolBar(navController = navController)
        }
    ){innerPadding ->
        Image(painter = painterResource(id = R.drawable.background), contentDescription = "Фон", Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = innerPadding)
        ) {
            Comments()
        }
    }
}
