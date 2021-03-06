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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Share
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
    Box() {
        val image: Painter = painterResource(id = R.drawable.detail_agave)
        Image(
            painter = image,
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Row() {
            Surface(
                color = MaterialTheme.colors.primary,
                shape = RoundedCornerShape(topEnd = 24.dp),
            ) {
                Text(
                    text = "$45",
                    style = MaterialTheme.typography.h2,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(12.dp)
                )
            }
            FloatingActionButton(
                onClick = {},
                backgroundColor = MaterialTheme.colors.background
            ) {
                Icon(Icons.Outlined.FavoriteBorder, "")
            }
            FloatingActionButton(
                onClick = {},
                backgroundColor = MaterialTheme.colors.background
            ) {
                Icon(Icons.Outlined.Share, "")
            }
        }
    }
}

@Composable
fun DetailContent() {
}

@Composable
fun MoreDetail() {
    val expanded = remember { mutableStateOf(false) }

    val extraPadding = if (expanded.value) 48.dp else 8.dp

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(bottom = extraPadding)
        ) {
            Text(
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Left,
                text = "Care instructions"
            )
        }
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

@Composable
fun RelatedCollections() {
    Column() {
        Row() {
            Text(
                style = MaterialTheme.typography.h1,
                text = "Related collections",
                textAlign = TextAlign.Left
            )
        }
        Row(
        ) {
            CollectionCardDesert()
            CollectionCardJungle()
            CollectionCardTerrarium()
            CollectionCardStatement()
            CollectionCardEasy()
        }
    }
}

@Composable
fun CollectionCardDesert() {
    Box(modifier = Modifier.padding(top = 8.dp, end = 8.dp)) {
        Card(
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier
                .width(136.dp)
                .height(136.dp)
                .background(color = MaterialTheme.colors.surface)
        ) {
            Column() {
                Box(
                    modifier = Modifier.height(96.dp)
                ) {
                    val image: Painter = painterResource(id = R.drawable.collection_desert)
                    Image(
                        painter = image,
                        contentScale = ContentScale.Crop,
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
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
}

@Composable
fun CollectionCardJungle() {
    Box(modifier = Modifier.padding(top = 8.dp, end = 8.dp)) {
        Card(
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier
                .width(136.dp)
                .height(136.dp)
                .background(color = MaterialTheme.colors.surface)
        ) {
            Column() {
                Box(
                    modifier = Modifier.height(96.dp)
                ) {
                    val image: Painter = painterResource(id = R.drawable.collection_jungle)
                    Image(
                        painter = image,
                        contentScale = ContentScale.Crop,
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(
                    text = "Jungle vibes",
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier
//                    .align(Alignment.Horizontal.BottomStart)
                        .padding(all = 8.dp)
                )
            }
        }
    }
}

@Composable
fun CollectionCardTerrarium() {
    Box(modifier = Modifier.padding(top = 8.dp, end = 8.dp)) {
        Card(
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier
                .width(136.dp)
                .height(136.dp)
                .background(color = MaterialTheme.colors.surface)
        ) {
            Column() {
                Box(
                    modifier = Modifier.height(96.dp)
                ) {
                    val image: Painter = painterResource(id = R.drawable.collection_terrarium)
                    Image(
                        painter = image,
                        contentScale = ContentScale.Crop,
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(
                    text = "Tiny terrariums",
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier
//                    .align(Alignment.Horizontal.BottomStart)
                        .padding(all = 8.dp)
                )
            }
        }
    }
}

@Composable
fun CollectionCardStatement() {
    Box(modifier = Modifier.padding(top = 8.dp, end = 8.dp)) {
        Card(
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier
                .width(136.dp)
                .height(136.dp)
                .background(color = MaterialTheme.colors.surface)
        ) {
            Column() {
                Box(
                    modifier = Modifier.height(96.dp)
                ) {
                    val image: Painter = painterResource(id = R.drawable.collection_statement)
                    Image(
                        painter = image,
                        contentScale = ContentScale.Crop,
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(
                    text = "Statement plants",
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier
//                    .align(Alignment.Horizontal.BottomStart)
                        .padding(all = 8.dp)
                )
            }
        }
    }
}

@Composable
fun CollectionCardEasy() {
    Box(modifier = Modifier.padding(top = 8.dp, end = 8.dp)) {
        Card(
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier
                .width(136.dp)
                .height(136.dp)
                .background(color = MaterialTheme.colors.surface)
        ) {
            Column() {
                Box(
                    modifier = Modifier.height(96.dp)
                ) {
                    val image: Painter = painterResource(id = R.drawable.collection_easy)
                    Image(
                        painter = image,
                        contentScale = ContentScale.Crop,
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(
                    text = "Easy care",
                    style = MaterialTheme.typography.h2,
                    modifier = Modifier
//                    .align(Alignment.Horizontal.BottomStart)
                        .padding(all = 8.dp)
                )
            }
        }
    }
}


@Preview()
@Composable
fun RelatedCollectionsPreview() {
    BloomTheme {
        RelatedCollections()
    }
}

@Preview(device = "spec")
@Composable
fun DetailPreview() {
    BloomTheme {
        DetailScreen()
    }
}

