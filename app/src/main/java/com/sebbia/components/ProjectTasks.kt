package com.sebbia.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sebbia.Routes
import com.sebbia.ui.theme.Grey
import com.sebbia.R


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ProjectTask(navController: NavHostController) {
    val shape = RoundedCornerShape(12.dp)
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
                Box(modifier = Modifier
                    .clip(shape)
                    .background(Grey)
                    .fillMaxWidth()){
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp), verticalArrangement = Arrangement.spacedBy(15.dp)) {
                        Text(text = "Все задачи", modifier = Modifier.padding(bottom = 5.dp),
                            fontSize = 20.sp)
                        Box(modifier = Modifier
                            .clip(shape)
                            .background(Color.White)
                            .fillMaxWidth()
                            .padding(all = 10.dp)
                            .clickable { navController.navigate(Routes.ProjectSubTask.route) }){
                            Column(modifier = Modifier
                                .fillMaxWidth()) {
                                Row {
                                    Text(text = "Задача №1")
                                    Spacer(modifier = Modifier.weight(1f, true))
                                    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                        IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.List,
                                            tint = Color.Black, contentDescription = "Описание",
                                            modifier = Modifier.size(20.dp)) }
                                    }
                                }
                                Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                                    Text(text = "Изучение Kotlin multilatform",
                                        fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.width(200.dp))

                                }
                                Row {
                                    Text(text = "Backend, Mobile", modifier = Modifier.weight(1f))
                                    Spacer(modifier = Modifier.weight(0.1f, true))
                                    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                        IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Add,
                                            tint = Color.Black, contentDescription = "Добавить",
                                            modifier = Modifier.size(20.dp)) }
                                        Spacer(modifier = Modifier.weight(0.1f, true))
                                        IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Create,
                                            tint = Color.Black, contentDescription = "Редактировать",
                                            modifier = Modifier.size(20.dp)) }
                                        Spacer(modifier = Modifier.weight(0.1f, true))
                                        IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Delete,
                                            tint = Color.Black, contentDescription = "Удалить",
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
                                    Text(text = "Задача №2")
                                    Spacer(modifier = Modifier.weight(1f, true))
                                    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                        IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.List,
                                            tint = Color.Black, contentDescription = "Описание",
                                            modifier = Modifier.size(20.dp)) }
                                    }
                                }
                                Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                                    Text(text = "Сделать и связать БД",
                                        fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.width(200.dp))
                                    Spacer(modifier = Modifier.weight(1f, true))
                                    Text(text = "140 ч")

                                }
                                Row {
                                    Text(text = "Backend, Mobile", modifier = Modifier.weight(1f))
                                    Spacer(modifier = Modifier.weight(0.1f, true))
                                    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                        IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Add,
                                            tint = Color.Black, contentDescription = "Добавить",
                                            modifier = Modifier.size(20.dp)) }
                                        Spacer(modifier = Modifier.weight(0.1f, true))
                                        IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Create,
                                            tint = Color.Black, contentDescription = "Редактировать",
                                            modifier = Modifier.size(20.dp)) }
                                        Spacer(modifier = Modifier.weight(0.1f, true))
                                        IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Delete,
                                            tint = Color.Black, contentDescription = "Удалить",
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
                                    Text(text = "Задача №3")
                                }
                                Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                                    Text(text = "Сделать UI",
                                        fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.width(200.dp))

                                }
                                Row {
                                    Text(text = "Frontend", modifier = Modifier.weight(1f))
                                    Spacer(modifier = Modifier.weight(0.1f, true))
                                    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                        IconButton(onClick = { /*TODO*/ }) { Icon(
                                            Icons.Filled.Add,
                                            tint = Color.Black, contentDescription = "Добавить",
                                            modifier = Modifier.size(20.dp)) }
                                        Spacer(modifier = Modifier.weight(0.1f, true))
                                        IconButton(onClick = { /*TODO*/ }) { Icon(
                                            Icons.Filled.Create,
                                            tint = Color.Black, contentDescription = "Редактировать",
                                            modifier = Modifier.size(20.dp)) }
                                        Spacer(modifier = Modifier.weight(0.1f, true))
                                        IconButton(onClick = { /*TODO*/ }) { Icon(
                                            Icons.Filled.Delete,
                                            tint = Color.Black, contentDescription = "Удалить",
                                            modifier = Modifier.size(20.dp)) }
                                    }
                                }
                            }
                        }
                        var createNewFun by remember {mutableStateOf(false)}
                        if(createNewFun){
                            NewTask()
                        }
                        createNewFun = false
                        Row {
                            TextButton(onClick = { createNewFun = true }, modifier = Modifier.width(220.dp)) {
                                CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
                                    IconButton(onClick = {}) { Icon(Icons.Filled.Add,
                                        tint = Color.Black, contentDescription = "Добавить",
                                        modifier = Modifier.size(20.dp)) }
                                    Spacer(modifier = Modifier.weight(0.1f, true))
                                }
                                Text(text = "Добавить задачу", modifier = Modifier
                                    .weight(8f), color = Color.Black, fontSize = 18.sp)
                            }
                        }
                    }
                }

                Box(modifier = Modifier
                    .clip(shape)
                    .background(Grey)
                    .fillMaxWidth()){
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp), verticalArrangement = Arrangement.spacedBy(15.dp)) {
                        Text(text = "Выполненные задачи", modifier = Modifier.padding(bottom = 5.dp),
                            fontSize = 20.sp)
                        val createNewFun = remember {mutableStateOf(false)}
                        if(createNewFun.value){
                            NewTask()
                        }
                        TextButton(onClick = { createNewFun.value = true }, modifier = Modifier.width(220.dp)) {
                            CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
                                IconButton(onClick = {}) { Icon(Icons.Filled.Add,
                                    tint = Color.Black, contentDescription = "Добавить",
                                    modifier = Modifier.size(20.dp)) }
                            }
                            Text(text = "Добавить задачу", modifier = Modifier
                                .weight(8f), color = Color.Black, fontSize = 18.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {

}