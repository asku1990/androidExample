package com.example.helloworldapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworldapp.ui.theme.HelloWorldAppTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    SecondScreen()
                }
            }
        }
    }
}

@Composable
fun SecondScreen() {
    Text(text = "This is the second screen!")
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    HelloWorldAppTheme {
        SecondScreen()
    }
}