package com.sebbia.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sebbia.R
import com.sebbia.Routes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ProjectScreen(navController: NavHostController) {
    val shape = RoundedCornerShape(12.dp)
    Scaffold(
        topBar = {
            ToolBarMain(navController = navController)
        }
    ){innerPadding ->
        Image(painter = painterResource(id = R.drawable.background), contentDescription = "Фон", Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = innerPadding)
        ) {
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
                    .padding(all = 10.dp).clickable { navController.navigate(Routes.ProjectTasks.route) }){
                    Column(modifier = Modifier
                        .fillMaxWidth()) {
                        Row {
                            Text(text = "Сайт Nissan", fontSize=20.sp,
                                modifier = Modifier
                                    .width(250.dp))
                            Spacer(modifier = Modifier.weight(1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Create,
                                    tint = Color.Black, contentDescription = "Описание",
                                    modifier = Modifier.size(20.dp)) }
                                Spacer(modifier = Modifier.weight(0.1f, true))
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Delete,
                                    tint = Color.Black, contentDescription = "Редактировать",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                        Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                            Text(text = "Время на выполнение: 72 часа",
                                fontSize = 15.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.width(200.dp))
                        }
                        Row {
                            Text(text = "Участники: 4", modifier = Modifier.weight(1f))
                            Spacer(modifier = Modifier.weight(0.1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.KeyboardArrowRight,
                                    tint = Color.Black, contentDescription = "Добавить",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                    }
                }
                Box(modifier = Modifier
                    .clip(shape)
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(all = 10.dp)){
                    Column(modifier = Modifier
                        .fillMaxWidth()) {
                        Row {
                            Text(text = "Мобильное приложение \n" +
                                    "Alabuga Tech ", fontSize=20.sp,
                                modifier = Modifier
                                    .width(250.dp))
                            Spacer(modifier = Modifier.weight(1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Create,
                                    tint = Color.Black, contentDescription = "Описание",
                                    modifier = Modifier.size(20.dp)) }
                                Spacer(modifier = Modifier.weight(0.1f, true))
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Delete,
                                    tint = Color.Black, contentDescription = "Редактировать",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                        Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                            Text(text = "Время на выполнение: 1072 часа",
                                fontSize =15.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.width(200.dp))
                            Spacer(modifier = Modifier.weight(1f, true))
                        }
                        Row {
                            Text(text = "Участники: 12", modifier = Modifier.weight(1f))
                            Spacer(modifier = Modifier.weight(0.1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.KeyboardArrowRight,
                                    tint = Color.Black, contentDescription = "Добавить",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                    }
                }
                Box(modifier = Modifier
                    .clip(shape)
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(all = 10.dp)){
                    Column(modifier = Modifier
                        .fillMaxWidth()) {
                        Row {
                            Text(text = "Мобильное приложение \n" +
                                    "Chudnaya Dolina ", fontSize=20.sp,
                                modifier = Modifier
                                    .width(250.dp))
                            Spacer(modifier = Modifier.weight(1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Create,
                                    tint = Color.Black, contentDescription = "Описание",
                                    modifier = Modifier.size(20.dp)) }
                                Spacer(modifier = Modifier.weight(0.1f, true))
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.Delete,
                                    tint = Color.Black, contentDescription = "Редактировать",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                        Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                            Text(text = "Время на выполнение: 163 часа",
                                fontSize = 15.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.width(200.dp))
                        }
                        Row {
                            Text(text = "Участники: 6", modifier = Modifier.weight(1f))
                            Spacer(modifier = Modifier.weight(0.1f, true))
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                IconButton(onClick = { /*TODO*/ }) { Icon(
                                    Icons.Filled.KeyboardArrowRight,
                                    tint = Color.Black, contentDescription = "Добавить",
                                    modifier = Modifier.size(20.dp)) }
                            }
                        }
                    }
                }
            }
        }
    }
}
