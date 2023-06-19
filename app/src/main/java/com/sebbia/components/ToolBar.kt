package com.sebbia.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavHostController
import com.sebbia.Routes
import com.sebbia.ui.theme.Grey
import com.sebbia.ui.theme.LightBlue
import com.sebbia.ui.theme.LightGreen

@Composable
fun ToolBar(navController: NavHostController) {
    Box(modifier = Modifier
        .height(60.dp)
        .fillMaxWidth()
        .background(LightBlue)
        .padding(all = 0.dp)){
        TopAppBar(backgroundColor = Color.Transparent,
            modifier = Modifier.padding(start = 6.dp, end = 6.dp),
            elevation = 0.dp,
        ){
            Spacer(Modifier.weight(0.5f, true))
            Text(text = "Сайт Nissan", color = Color(0xFFFFFFFF), fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(6f))
            Spacer(Modifier.weight(1f, true))
            IconButton(onClick = {  }) { Icon(Icons.Filled.Search, tint = Color(0xFFFFFFFF), contentDescription = "Поиск")}
            IconButton(onClick = { navController.navigate(Routes.Menu.route) }) { Icon(Icons.Filled.Menu, tint = Color(0xFFFFFFFF),contentDescription = "Меню")}
        }
    }

}
@SuppressLint("UnrememberedMutableState")
@Composable
fun ToolBarMain(navController: NavHostController) {
    var shown by remember {mutableStateOf(false)}
    Box(modifier = Modifier
        .height(60.dp)
        .fillMaxWidth()
        .background(LightBlue)
        .padding(all = 0.dp)){
        TopAppBar(backgroundColor = Color.Transparent,
            modifier = Modifier.padding(start = 6.dp, end = 6.dp),
            elevation = 0.dp,
        ){
            Spacer(Modifier.weight(1f, true))
            Text(text = "Все проекты", color = Color(0xFFFFFFFF), fontSize = 20.sp, modifier = Modifier.weight(6f))
            Spacer(Modifier.weight(2f, true))
            IconButton(onClick = { /*TODO*/ }) { Icon(Icons.Filled.Search, tint = Color(0xFFFFFFFF), contentDescription = "Поиск")}
            Spacer(Modifier.weight(0.1f, true))
            IconButton(onClick = { shown = true }) { Icon(Icons.Filled.Add, tint = Color(0xFFFFFFFF), contentDescription = "Создать")}
            Spacer(Modifier.weight(0.1f, true))
            IconButton(onClick = { navController.navigate(Routes.Menu.route) }) { Icon(Icons.Filled.Menu, tint = Color(0xFFFFFFFF),contentDescription = "Меню")}
        }
        Create(showDialog = shown)
    }
}
@Composable
fun ToolBarDescription(navController: NavHostController) {
    Box(modifier = Modifier
        .height(60.dp)
        .fillMaxWidth()
        .background(LightBlue)
        .padding(all = 0.dp)){
        TopAppBar(backgroundColor = Color.Transparent,
            modifier = Modifier.padding(start = 6.dp, end = 6.dp),
            elevation = 0.dp
        ){
            Spacer(Modifier.weight(1f, true))
            Text(text = "Изучение Kotlin Multiply", color = Color(0xFFFFFFFF), fontSize = 20.sp, maxLines = 1, overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(200.dp))
            Spacer(Modifier.weight(1f, true))
            IconButton(onClick = { navController.navigate(Routes.Menu.route) }) { Icon(Icons.Filled.Menu, tint = Color(0xFFFFFFFF),contentDescription = "Меню")}
        }
    }
}
