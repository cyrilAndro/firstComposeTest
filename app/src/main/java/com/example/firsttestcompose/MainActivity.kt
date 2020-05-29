package com.example.firsttestcompose

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Spacer
import androidx.ui.layout.preferredHeight
import androidx.ui.material.Button
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.firsttestcompose.JetNews.JetNewsActivity
import com.example.firsttestcompose.ui.AppTheme
import com.example.firsttestcompose.users.UserListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                App()
            }
        }
    }

    @Preview
    @Composable
    private fun App() {

        val click = ClickCount()

        Column {
            TopAppBar(
                title = {
                    Text(text = "First Test Compose")
                },
                contentColor = Color.Red,
                backgroundColor = Color.Cyan
            )
            Spacer(Modifier.preferredHeight(24.dp))

            Text(text = "Hey Jetpack Compose, First line ?")

            Spacer(Modifier.preferredHeight(24.dp))



            Button(onClick = { click.count++ }) {

                Text(text = "count is ${click.count}")
            }

            Button(onClick = {
                startActivity(
                    Intent(
                        this@MainActivity,
                        UserListActivity::class.java
                    )
                )
            }) {
                Text(text = "Open ActivityTwo")
            }

            Button(onClick = {
                startActivity(
                    Intent(
                        this@MainActivity,
                        JetNewsActivity::class.java
                    )
                )
            }) {
                Text(text = "Open JetNews Activity")
            }
        }


    }


    @Model
    class ClickCount(var count: Int = 0)
}





