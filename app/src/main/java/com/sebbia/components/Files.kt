package com.sebbia.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sebbia.R
import com.sebbia.ui.theme.LightGreen


@Composable
fun Files(navController: NavHostController) {
    val shape = RoundedCornerShape(20.dp)
    val image = ImageBitmap.imageResource(R.drawable.background)
    val brush = remember(image) { ShaderBrush(ImageShader(image, TileMode.Repeated, TileMode.Repeated)) }
    Scaffold(
        topBar = {
            ToolBar(navController = navController)
        }
    ) {padding ->
        Box(modifier = Modifier.background(brush)){
            Column() {
                Button(
                    onClick = { /*TODO*/ },
                    shape = shape,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = LightGreen,
                        contentColor = Color.Black
                    ), modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Добавить файл")
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Box(modifier = Modifier
                        .clip(shape)
                        .background(Color.White)
                        .fillMaxWidth()
                        .padding(all = 10.dp).clickable {  }){
                        Text(text = "Logo.png")
                    }
                }
            }
        }
    }
}





