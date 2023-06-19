package com.sebbia.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sebbia.ui.theme.*


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CreateTaskDialog() {
    val shape = RoundedCornerShape(12.dp)
    var expanded by remember { mutableStateOf(false) }
    val options = listOf("Выберите категорию", "1", "2", "3", "4")
    var selectedOptionText by remember { mutableStateOf(options[0]) }
    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Box(modifier = Modifier.clip(shape)){
            Column(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier
                    .background(LightBlue)
                    .fillMaxWidth()
                    .height(40.dp), contentAlignment = Alignment.Center){
                    Text(text = "Создание задачи", textAlign = TextAlign.Center, color = Color.White, )
                }
                Box(modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()){
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row() {
                            val text = remember { mutableStateOf("") }
                            TextField(
                                value = text.value,
                                onValueChange = {text.value = it},
                                textStyle = TextStyle(fontSize = 16.sp),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp),
                                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent),
                                placeholder = { Text(text = "Название", color = Grey, fontSize = 16.sp)})
                        }
                        ExposedDropdownMenuBox(
                            expanded = expanded,
                            onExpandedChange = {
                                expanded = !expanded
                            }
                        ) {
                            TextField(modifier = Modifier.fillMaxWidth(),
                                readOnly = true,
                                value = selectedOptionText,
                                onValueChange = { },
                                trailingIcon = {
                                    ExposedDropdownMenuDefaults.TrailingIcon(
                                        expanded = expanded,
                                    )
                                },
                                colors = ExposedDropdownMenuDefaults.textFieldColors(backgroundColor = Color.White)
                            )
                            ExposedDropdownMenu(
                                expanded = expanded,
                                onDismissRequest = {
                                    expanded = false
                                }, modifier = Modifier.fillMaxWidth()
                            ) {
                                options.forEach { selectionOption ->
                                    DropdownMenuItem(
                                        onClick = {
                                            selectedOptionText = selectionOption
                                            expanded = false
                                        }
                                    ){
                                        Text(text = selectionOption)
                                    }
                                }
                            }
                        }
                    }
                }
                Box(modifier = Modifier
                    .background(LightGreen)
                    .fillMaxWidth()){
                    TextButton(onClick = { /*TODO*/ }, modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)) {
                        Text(text = "Создать", color = Color.Black)
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun t() {
    CreateTaskDialog()
}