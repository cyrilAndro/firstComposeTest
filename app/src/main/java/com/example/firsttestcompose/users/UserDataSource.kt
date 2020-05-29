package com.example.firsttestcompose.users

import java.util.ArrayList

object UserDataSource {

    fun getUsers():List<User>{
             return ArrayList<User>().apply {
                 add(User(1, "John", "john@gmail.com"))
                 add(User(2, "Bobby", "bobby@gmail.com"))
                 add(User(3, "Tony", "tony@gmail.com"))
                 add(User(4, "Bogdan", "bogdan@gmail.com"))
                 add(User(5, "Miroslav", "miroslav@gmail.com"))
                 add(User(6, "Ping", "ping@gmail.com"))
                 add(User(7, "Pong", "pong@gmail.com"))
                 add(User(1, "John", "john@gmail.com"))
                 add(User(2, "Bobby", "bobby@gmail.com"))
                 add(User(3, "Tony", "tony@gmail.com"))
                 add(User(4, "Bogdan", "bogdan@gmail.com"))
                 add(User(5, "Miroslav", "miroslav@gmail.com"))
                 add(User(6, "Ping", "ping@gmail.com"))
                 add(User(7, "Pong", "pong@gmail.com"))
                 add(User(1, "John", "john@gmail.com"))
                 add(User(2, "Bobby", "bobby@gmail.com"))
                 add(User(3, "Tony", "tony@gmail.com"))
                 add(User(4, "Bogdan", "bogdan@gmail.com"))
                 add(User(5, "Miroslav", "miroslav@gmail.com"))
                 add(User(6, "Ping", "ping@gmail.com"))
                 add(User(7, "Pong", "pong@gmail.com"))
             }
    }

}