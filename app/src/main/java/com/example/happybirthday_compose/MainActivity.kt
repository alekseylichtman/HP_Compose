package com.example.happybirthday_compose

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday_compose.ui.theme.HappyBirthday_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthday_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithImage("Happy birthday, Yoba","Yeboba")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    //Step 3 create a box to overlap image and texts
    Box {
        Image(
            painter = painterResource(R.drawable.androidparty),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
        BirthdayGreetingWithText(message = message, from = from)
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = message,
            fontSize = 36.sp
        )
        Spacer(modifier = Modifier.weight(1.0f))
        Text(
            text = from,
            fontSize =  24.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .align(Alignment.End)
        )
    }
}

@Preview(name = "Yoba",
        showSystemUi = true)
@Composable
fun DefaultPreview() {
    HappyBirthday_ComposeTheme {
        BirthdayGreetingWithImage("Happy birthday, Yoba", "yeboba")
    }
}