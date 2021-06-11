package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    /*
    Column(modifier = Modifier.background(Color.Red), content = {
        Text(text = "A day in Shark Fin Cove")
        Text(text = "Davenport, California")
        Text(text = "December 2018")
    })
    */

    /*
    Column(
        modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
    ) {
        Text(text = "A day in Shark Fin Cove")
        Text(text = "Davenport, California")
        Text(text = "December 2018")
    }
    */

    Column {
        Text(text = "A day in Shark Fin Cove")
        Text(text = "Davenport, California")
        Text(text = "December 2018")
    }
}

@Preview
@Composable
fun PreviewApp() {
    NewsStory()
}