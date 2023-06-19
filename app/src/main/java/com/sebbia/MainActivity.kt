package com.sebbia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sebbia.components.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           ScreenMain()
        }
    }
}

@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.AuthorizationScreen.route) {

        composable(Routes.ProjectTasks.route) {
            ProjectTask(navController = navController)
        }

        composable(Routes.ProjectSubTask.route) {
            ProjectSubTask(navController = navController)
        }

        composable(Routes.Comments.route) {
            CommentsScreen(navController = navController)
        }

        composable(Routes.ProjectScreen.route) {
            ProjectScreen(navController = navController)
        }

        composable(Routes.AuthorizationScreen.route) {
            AuthScreen(navController = navController)
        }

        composable(Routes.Menu.route) {
            Menu(navController = navController)
        }

        composable(Routes.Files.route) {
            Files(navController = navController)
        }

        composable(Routes.Users.route) {
            Users(navController = navController)
        }

        composable(Routes.Members.route) {
            Members(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}