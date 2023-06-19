package com.sebbia.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sebbia.R
import com.sebbia.ui.theme.LightGreen


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Users(navController: NavHostController) {
    val shape = RoundedCornerShape(12.dp)
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
                    Text(text = "Добавить участников")
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
                        .padding(all = 10.dp)){
                        Column(modifier = Modifier
                            .fillMaxWidth()) {
                            Row {
                                Text(text = "Комментатор", fontSize = 16.sp, color = LightGreen)
                                Spacer(modifier = Modifier.weight(1f, true))
                                CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                    IconButton(onClick = { /*TODO*/ }) { Icon(
                                        Icons.Filled.Create,
                                        tint = Color.Black, contentDescription = "Редактировать",
                                        modifier = Modifier.size(20.dp)) }
                                }
                            }
                            Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp), verticalAlignment = Alignment.CenterVertically) {
                                Image(
                                    painter = painterResource(R.drawable.avatar),
                                    contentDescription = "Circle Image",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape)
                                )
                                Text(text = "User 1", modifier = Modifier.padding(start = 12.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}





