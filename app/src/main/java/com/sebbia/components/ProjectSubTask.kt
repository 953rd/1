package com.sebbia.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sebbia.R
import com.sebbia.Routes
import com.sebbia.ui.theme.Grey


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ProjectSubTask(navController: NavHostController){
    val shape = RoundedCornerShape(12.dp)

    val image = ImageBitmap.imageResource(R.drawable.background)
    val brush = remember(image) { ShaderBrush(ImageShader(image, TileMode.Repeated,
        TileMode.Repeated)) }
    Scaffold(
        topBar = {
            ToolBarDescription(navController = navController)
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
                        .padding(20.dp), verticalArrangement = Arrangement.spacedBy(5.dp),
                        Alignment.CenterHorizontally) {
                        Text(text = "Описание", modifier = Modifier
                            .padding(bottom = 5.dp)
                            .fillMaxWidth(),
                            fontSize = 20.sp, textAlign = TextAlign.Center)
                        Box(modifier = Modifier
                            .clip(shape)
                            .background(Color.White)
                            .fillMaxWidth()
                            .padding(all = 10.dp)){
                            val text = remember { mutableStateOf("") }
                            val maxChar = 100
                            TextField(
                                value = text.value,
                                onValueChange = {if (it.length <= maxChar) text.value = it},
                                textStyle = androidx.compose.ui.text.TextStyle(fontSize = 12.sp),
                                modifier = Modifier.fillMaxWidth(),
                                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent),
                                placeholder = { Text(text = "Краткое описание (100 символов)",
                                    color = Grey)})
                        }
                        TextButton(onClick = { navController.navigate(Routes.Comments.route) }) {
                            Text(text = "Подробнее...", color = Color.Black, fontSize = 16.sp)
                        }
                    }
                }
                Button(onClick = { navController.navigate(Routes.Files.route) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Grey),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape)) {
                    Text(text = "Файлы", modifier = Modifier.padding(bottom = 5.dp),
                        fontSize = 20.sp)
                }
                Button(onClick = { navController.navigate(Routes.Users.route) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Grey),
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape)) {
                    Text(text = "Участники", modifier = Modifier.padding(bottom = 5.dp),
                        fontSize = 20.sp)
                }
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
                            .padding(all = 10.dp)){
                            Column(modifier = Modifier
                                .fillMaxWidth()) {
                                Row {
                                    Text(text = "Задача №1.1")
                                    Spacer(modifier = Modifier.weight(1f, true))
                                    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                        IconButton(onClick = { /*TODO*/ }) { Icon(
                                            Icons.Filled.List,
                                            tint = Color.Black, contentDescription = "Описание",
                                            modifier = Modifier.size(20.dp)) }
                                    }
                                }
                                Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                                    Text(text = "Синтаксис",
                                        fontSize = 20.sp, maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.width(200.dp))

                                }
                                Row {
                                    Text(text = "Backend, Mobile", modifier = Modifier.weight(1f))
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
                        Box(modifier = Modifier
                            .clip(shape)
                            .background(Color.White)
                            .fillMaxWidth()
                            .padding(all = 10.dp)){
                            Column(modifier = Modifier
                                .fillMaxWidth()) {
                                Row {
                                    Text(text = "Задача №1.2")
                                    Spacer(modifier = Modifier.weight(1f, true))
                                    CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false){
                                        IconButton(onClick = { /*TODO*/ }) { Icon(
                                            Icons.Filled.List,
                                            tint = Color.Black, contentDescription = "Описание",
                                            modifier = Modifier.size(20.dp)) }
                                    }
                                }
                                Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                                    Text(text = "Конструкции",
                                        fontSize = 20.sp, maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.width(200.dp))
                                    Spacer(modifier = Modifier.weight(1f, true))
                                    Text(text = "140 ч")

                                }
                                Row {
                                    Text(text = "Backend, Mobile", modifier = Modifier.weight(1f))
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

                        Box(modifier = Modifier
                            .clip(shape)
                            .background(Color.White)
                            .fillMaxWidth()
                            .padding(all = 10.dp)){
                            Column(modifier = Modifier
                                .fillMaxWidth()) {
                                Row {
                                    Text(text = "Задача №1.3")
                                }
                                Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                                    Text(text = "Паттерны",
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

                        Row {
                            TextButton(onClick = {  }, modifier = Modifier.width(220.dp)) {
                                CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
                                    IconButton(onClick = {}) { Icon(
                                        Icons.Filled.Add,
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
                        Text(text = "Выполнено", modifier = Modifier.padding(bottom = 5.dp),
                            fontSize = 20.sp)
                        val createNewFun = remember { mutableStateOf(false) }
                        if(createNewFun.value){
                            NewTask()
                        }
                        Row {
                            TextButton(onClick = { createNewFun.value = true }, modifier = Modifier.width(220.dp)) {
                                CompositionLocalProvider(LocalMinimumInteractiveComponentEnforcement provides false) {
                                    IconButton(onClick = {}) { Icon(
                                        Icons.Filled.Add,
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
}