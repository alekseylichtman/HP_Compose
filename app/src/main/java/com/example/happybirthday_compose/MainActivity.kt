package com.example.happybirthday_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday_compose.ui.theme.HappyBirthday_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthday_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithText("Happy birthday, Yoba","Yeboba")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(
            text = message,
            fontSize = 36.sp
        )
        Text(
            text = from,
            fontSize =  24.sp
        )
    }
}

@Preview(name = "Yoba",
        showSystemUi = true)
@Composable
fun DefaultPreview() {
    HappyBirthday_ComposeTheme {
        BirthdayGreetingWithText("Happy birthday, Yoba", "yeboba")
    }
}