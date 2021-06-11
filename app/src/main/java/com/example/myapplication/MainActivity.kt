package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gretting("Android")
        }
    }
}

@Composable
fun Gretting(name: String) {
    Text(text = "Hello, $name")
}

@Preview
@Composable
fun PreviewGretting() {
    Gretting("Android")
}