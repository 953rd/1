package com.sebbia.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NewTask(){
    val shape = RoundedCornerShape(12.dp)
    Box(modifier = Modifier
        .clip(shape)
        .background(Color.White)
        .fillMaxWidth()
        .padding(all = 10.dp)){
        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Задача №")
            }
            Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                Text(text = "Наименование задачи",
                    fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.width(200.dp))

            }
            Row() {
                Text(text = "Направление", modifier = Modifier.weight(1f))
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
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NewProject(){
    val shape = RoundedCornerShape(12.dp)
    Box(modifier = Modifier
        .clip(shape)
        .background(Color.White)
        .fillMaxWidth()
        .padding(all = 10.dp)){
        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row() {
                Text(text = "Задача №")
            }
            Row(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)) {
                Text(text = "Наименование задачи",
                    fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.width(200.dp))

            }
            Row() {
                Text(text = "Направление", modifier = Modifier.weight(1f))
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
}
