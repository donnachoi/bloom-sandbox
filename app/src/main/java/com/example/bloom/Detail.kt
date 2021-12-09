package com.example.bloom

import android.graphics.Color.alpha
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.zIndex
import com.example.bloom.ui.theme.BloomTheme

class Detail : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomTheme {
                // A surface container using the 'background' color from the theme
                DetailScreen()
            }
        }
    }
}

@Composable
fun DetailScreen() {
    Surface(color = MaterialTheme.colors.primary) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            DetailHero()
            DetailContent()
            RelatedCollections()
        }
    }
}

@Composable
fun DetailHero() {
}

@Composable
fun DetailContent() {
}

@Composable
fun RelatedCollections() {
}

@Preview(widthDp = 360, heightDp = 640)
@Preview(widthDp = 673, heightDp = 841)
@Composable
fun DetailPreview() {
    BloomTheme {
        DetailScreen()
    }
}