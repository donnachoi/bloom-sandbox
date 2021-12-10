package com.example.bloom

import android.graphics.Color.alpha
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.zIndex
import com.example.bloom.ui.theme.BloomTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

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
    Surface(color = MaterialTheme.colors.background) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            DetailHero()
            DetailContent()
            MoreDetail()
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
fun MoreDetail() {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Left,
                text = "Care instructions"
            )
        }
        Column(
            horizontalAlignment = Alignment.End,
        )
        {
            val expanded = remember { mutableStateOf(false) }
            OutlinedButton(
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.primary.copy(
                        alpha = 0f
                    )
                ),
                shape = MaterialTheme.shapes.large,
                elevation = ButtonDefaults.elevation(0.dp),
                onClick = { expanded.value = !expanded.value },
            ) {
                Text(if (expanded.value) "Show less" else "Show more")
            }
        }
    }
}

@Composable
fun RelatedCollections() {
    CollectionCard()
}

@Composable
fun CollectionCard() {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .width(136.dp)
            .height(136.dp)
            .background(color = MaterialTheme.colors.surface)
    ) {
        Column() {
            val image: Painter = painterResource(id = R.drawable.collection_desert)
            Image(
                painter = image,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(96.dp)
            )
            Text(
                text = "Desert chic",
                style = MaterialTheme.typography.h2,
                modifier = Modifier
//                    .align(Alignment.Horizontal.BottomStart)
                    .padding(all = 8.dp)
            )
        }
    }
}

@Preview
@Composable
fun CollectionCardPreview() {
    BloomTheme {
        CollectionCard()
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Preview(widthDp = 673, heightDp = 841)
@Composable
fun DetailPreview() {
    BloomTheme {
        DetailScreen()
    }
}

