package com.example.firsttestcompose.users

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxWidth
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ripple.RippleEffect
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.material.ripple.ripple


class UserListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                populateUser()
            }
        }
    }

    @Preview
    @Composable
    private fun populateUser() {
        setUpList(UserDataSource.getUsers())

    }

    @Composable
    private fun setUpList(users: List<User>) {
        VerticalScroller {
            Column {
                users.let {
                    it.forEach { user ->
                        printUser(user)
                    }
                }
            }
        }

    }

    @Composable
    private fun printUser(user: User) {
        Box {
            Clickable(onClick = {
                Toast.makeText(
                    this@UserListActivity,
                    "You clicked on the CardView of ${user.name}",
                    Toast.LENGTH_SHORT
                ).show()
            }) {


                Card {

                    Box(
                        padding = 16.dp,
                        modifier = Modifier.fillMaxWidth(),
                        gravity = Alignment.CenterStart
                    )
                    {
                        Column {
                            Text(text = user.name, style = MaterialTheme.typography.h6)
                            Text(text = user.email, style = MaterialTheme.typography.body2)
                        }
                    }
                }
            }
        }


    }
}