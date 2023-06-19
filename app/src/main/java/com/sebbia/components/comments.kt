package com.sebbia.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Comments() {
    val shape = RoundedCornerShape(12.dp)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 0.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(15.dp),
    ) {

        Box(
            modifier = Modifier
                .clip(shape)
                .background(Color.White)
                .fillMaxWidth()
                .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 0.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Text(
                        text = "Текст (от лат. textus — ткань; сплетение, сочетание) — зафиксированная на каком-либо материальном носителе человеческая мысль; в общем плане связная и полная последовательность символов.\n" +
                                "Существуют две основные трактовки понятия «текст»: имманентная (расширенная, философски нагруженная) и репрезентативная (более частная). Имманентный подход подразумевает отношение к тексту как к автономной реальности, нацеленность на выявление его внутренней структуры. Репрезентативный — рассмотрение текста как особой формы представления информации о внешней тексту действительности.\n" +
                                "В лингвистике термин «текст» используется в широком значении, включая и образцы устной речи. Восприятие текста изучается в рамках лингвистики текста и психолингвистики. Так, например, И. Р. Гальперин определяет текст следующим образом: «Это письменное сообщение, объективированное в виде письменного документа, состоящее из ряда высказываний, объединённых разными типами лексической, грамматической и логической связи, имеющее определённый модальный характер, прагматическую установку и соответственно литературно обработанное»[1].",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .width(340.dp)
                    )
                }
            }
        }

        Box {
            Button_comments()
        }

        Row {
            Icon(
                imageVector = Icons.Default.Person,tint = Color.White, contentDescription = "Person Icon",
                modifier = Modifier
                    .size(80.dp)
                    .width(10.dp)
            )
            OutLineTextFieldComments()
        }


        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Person,tint = Color.White, contentDescription = "Person Icon",
                modifier = Modifier
                    .size(80.dp)
                    .width(10.dp)
            )
            Text(text = "User1987", color = Color.White, fontSize = 15.sp)
            Spacer(Modifier.width(12.0.dp))
            Text(text = "Вчера в 12:10", color = Color.Gray, fontSize = 12.sp)
        }



        Box(
            modifier = Modifier
                .clip(shape)
                .background(Color.White)
                .fillMaxWidth()
                .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 0.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Text(
                        text = "Со всем из списка поработал. Буду начинать\n" +
                                "верстать\n" +
                                "по прототипу. Сейчас хочу разобраться с регистрацией и авторизацией, SnapKit Alamofire Firebase возможно",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .width(340.dp)
                    )
                }
            }
        }

        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth().padding(10.dp,0.dp)) {
            Text(text = "Изменить", color = Color.Gray, fontSize = 12.sp)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Person,tint = Color.White, contentDescription = "Person Icon",
                modifier = Modifier
                    .size(80.dp)
                    .width(10.dp)
            )
            Text(text = "User228", color = Color.White, fontSize = 15.sp)
            Spacer(Modifier.width(12.0.dp))
            Text(text = "Вчера в 13:44", color = Color.Gray, fontSize = 12.sp)
        }

        Box(
            modifier = Modifier
                .clip(shape)
                .background(Color.White)
                .fillMaxWidth()
                .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 0.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Text(
                        text = "Если есть подзадачи, то оценка задачи игнорируется, и остается только сумма подзадач",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .width(340.dp)
                    )
                }
            }
        }

        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth().padding(10.dp,0.dp)) {
            Text(text = "Изменить", color = Color.Gray, fontSize = 12.sp)
        }


        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Person,tint = Color.White, contentDescription = "Person Icon",
                modifier = Modifier
                    .size(80.dp)
                    .width(10.dp)
            )
            Text(text = "User0047", color = Color.White, fontSize = 15.sp)
            Spacer(Modifier.width(12.0.dp))
            Text(text = "Вчера в 14:44", color = Color.Gray, fontSize = 12.sp)
        }

        Box(
            modifier = Modifier
                .clip(shape)
                .background(Color.White)
                .fillMaxWidth()
                .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 0.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Text(
                        text = "Добавить категории в задачи по виду деятельности, категории могут пересекаться",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .width(340.dp)
                    )
                }
            }
        }

        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth().padding(10.dp,0.dp)) {
            Text(text = "Изменить", color = Color.Gray, fontSize = 12.sp)
        }
    }
}

@Composable
fun Button_comments(){

    Button(onClick = {},
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth()
            .padding(top = 0.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White, contentColor = Color.Black),
        shape = RoundedCornerShape(0,0,15,15))
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxHeight()){
            Text("Редактировать", fontSize = 12.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OutLineTextFieldComments() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = text,
        modifier = Modifier.padding(top = 10.dp),
        label = { Text("Enter comments") },
        onValueChange = { text = it },
        shape = RoundedCornerShape(25),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Black,
            unfocusedBorderColor = Color.Black,
            textColor = Color.Black,
            unfocusedLabelColor = Color.Gray,
            cursorColor = Color.Black,
            focusedLabelColor = Color.White,
            backgroundColor = Color.White)

    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    Comments()
}

