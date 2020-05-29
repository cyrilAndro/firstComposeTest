package com.example.firsttestcompose.JetNews

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.*
import androidx.ui.material.ripple.ripple
import androidx.ui.unit.dp
import com.example.firsttestcompose.ui.AppTheme
import postCardTop

class JetNewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme() {
                VerticalScroller {
                    Column {
                        TopAppBar(
                            title = {
                                Text(text = "First Test Compose")
                            },
                            contentColor = Color.White,
                            backgroundColor = Color.Cyan
                        )
                        JetNewsHomeScreenTopSection()



                    }
                }
            }
        }
    }

    @Composable
    private fun JetNewsHomeScreenTopSection() {

//        Column {
//            TopAppBar(
//                title = {
//                    Text(text = "First Test Compose")
//                },
//                contentColor = Color.White,
//                backgroundColor = Color.Cyan
//            )

        Text(
            modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp),
            text = "Top stories for you",
            style = MaterialTheme.typography.subtitle1
        )


        Card {
            ProvideEmphasis(EmphasisAmbient.current.high) {

                Clickable(modifier = Modifier.ripple(), onClick = {
                    Toast.makeText(
                        this@JetNewsActivity,
                        "You clicked on the first CardView",
                        Toast.LENGTH_SHORT
                    ).show()

                }) {

                    postCardTop()
                    HomeScreenDivider()

                }

            }

        }
    }


    @Composable
    private fun HomeScreenDivider() {
        Divider(
            modifier = Modifier.padding(start = 14.dp, end = 16.dp),
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.08f)
        )
    }

}

//}


//       {
//    PostCardTop(post = post)
//      }
//  HomeScreenDivider()
//    }
//
//        VerticalScroller {
//
//            Column {
//                TopAppBar(
//                    title = {
//                        Text(text = "First Test Compose")
//                    },
//                    contentColor = Color.White,
//                    backgroundColor = Color.Cyan
//                )
//
//                Spacer(Modifier.preferredHeight(24.dp))
//
//                Card {
//                    Clickable(
//                        modifier = Modifier.ripple(),
//                        onClick = {
//                            Toast.makeText(
//                                this@JetNewsActivity,
//                                "You clicked on the first CardView",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                        }
//                    ) {
//
//
//                        Text(text = "Top stories for you")
//                        Spacer(Modifier.preferredHeight(24.dp))
//                        Image(imageResource(id = R.drawable.cyril_avatar))
//
//                    }
//
//
//                }
//
//
//            }
//        }
//    }
