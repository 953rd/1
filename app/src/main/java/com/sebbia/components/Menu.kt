package com.sebbia.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sebbia.R
import com.sebbia.Routes
import com.sebbia.ui.theme.Red


@Composable
fun Menu(navController: NavHostController) {
    val shape = RoundedCornerShape(20.dp)
    val image = ImageBitmap.imageResource(R.drawable.background)
    val brush = remember(image) { ShaderBrush(ImageShader(image, TileMode.Repeated, TileMode.Repeated)) }
    Scaffold(
        topBar = {
            ToolBar(navController = navController)
        }
    ) {padding ->
        Box(modifier = Modifier.background(brush)){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Button(onClick = { navController.navigate(Routes.ProjectScreen.route) }, colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                ), modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp), shape = shape) {
                    Text(text = "Вернуться к проектам")
                }
                Button(onClick = { navController.navigate(Routes.Members.route) }, colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                ), modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp), shape = shape) {
                    Text(text = "Пользователи")
                }
                Button(onClick = { navController.navigate(Routes.AuthorizationScreen.route) }, colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                ), modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp), shape = shape) {
                    Text(text = "Выйти", color = Red)
                }
            }
        }
    }
}





