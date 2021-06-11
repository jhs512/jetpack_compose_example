package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    NewList()
                }
            }
        }
    }
}

@Composable
fun NewList() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        for (i in 1..10) {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.header),
            contentDescription = null,
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(Modifier.height(16.dp))

        Text(
            text = "A day wandering through the sandhills" +
                    " in Shark Fin Cove, and a few of the" +
                    " sights I saw",
            style = typography.h6,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "Davenport, California",
            style = typography.body2
        )
        Text(
            text = "December 2018",
            style = typography.body2
        )
    }
}

@Preview
@Composable
fun PreviewApp() {
    MyApplicationTheme {
        Surface(color = MaterialTheme.colors.background) {
            NewList()
        }
    }
}