package com.sebbia.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.sebbia.R
import com.sebbia.Routes

@Composable
fun AuthScreen(navController: NavHostController) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    var password by rememberSaveable { mutableStateOf("") }

    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "im1",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds)
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        Image(painter = painterResource(id = R.drawable.logo2),
            contentDescription = "im2", modifier = Modifier.width(280.dp))
        TextField(
            value = text,
            modifier = Modifier.padding(top = 10.dp),
            label = { Text("Enter login") },
            onValueChange = { text = it },
            shape = RoundedCornerShape(10,10,0,0),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Black,
                textColor = Color.Black,
                unfocusedLabelColor = Color.Gray,
                cursorColor = Color.Black,
                focusedLabelColor = Color.Black,
                backgroundColor = Color.White)

        )
        TextField(
                value = password,
        modifier = Modifier.padding(top = 10.dp),
        onValueChange = { password = it },
        label = { Text("Enter password") },
        visualTransformation = PasswordVisualTransformation(),
        shape = RoundedCornerShape(0),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Black,
            unfocusedBorderColor = Color.Black,
            textColor = Color.Black,
            unfocusedLabelColor = Color.Gray,
            cursorColor = Color.Black,
            focusedLabelColor = Color.Black,
            backgroundColor = Color.White)
        )
        Button(onClick = {navController.navigate(Routes.ProjectScreen.route)},
        modifier = Modifier
            .height(65.dp)
            .width(278.dp)
            .padding(top = 10.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White, contentColor = Color.Black),
        shape = RoundedCornerShape(0,0,10,10))
        {
            Column{
                Text("В бой", fontSize = 16.sp)
            }
        }
    }
}


