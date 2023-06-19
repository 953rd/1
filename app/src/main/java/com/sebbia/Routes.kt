package com.sebbia

sealed class Routes (val route: String){
    object ProjectTasks : Routes("TaskScreen")
    object ProjectSubTask : Routes("SubTaskScreen")
    object AuthorizationScreen : Routes("AuthScreen")
    object ProjectScreen : Routes("ProjectScreen")
    object Comments : Routes("CommentScreen")
    object Files : Routes("Files")
    object Users : Routes("UsersList")
    object Menu : Routes("Menu")
    object Members : Routes("MemberList")
}