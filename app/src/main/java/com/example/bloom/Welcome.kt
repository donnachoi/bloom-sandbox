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

class Welcome : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomTheme {
                // A surface container using the 'background' color from the theme
                WelcomeScreen()
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    Surface(color = MaterialTheme.colors.primary) {
        WelcomeBgImage()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            WelcomeSplashImage()
            Name()
            Description()
            ButtonCreate()
            ButtonLogin()
        }
    }
}

@Composable
fun WelcomeBgImage() {
    val image: Painter = painterResource(id = R.drawable.light_welcome_bg)
    Image(
        painter = image,
        contentDescription = "",
        contentScale = ContentScale.FillWidth,
        alpha = 0.75f,
        modifier = Modifier
            .fillMaxSize(1f)
            .zIndex(-1f)
    )
}

@Composable
fun WelcomeSplashImage() {
    val image: Painter = painterResource(id = R.drawable.light_welcome_illos)
    Image(
        painter = image,
        contentDescription = "",
    )
}

@Composable
fun Name() {
    val image: Painter = painterResource(id = R.drawable.light_logo)
    Image(
        painter = image,
        contentDescription = "",
    )
}

@Composable
fun Description() {
    Text(text = "Beautiful home garden solutions")
}

@Composable
fun ButtonCreate() {
    val buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.secondary,
        contentColor = MaterialTheme.colors.background,
    )
    Button(
        colors = buttonColors,
        shape = MaterialTheme.shapes.large,
        onClick = {}
    ) {
        Text("Create account")
    }
}

@Composable
fun ButtonLogin() {
    OutlinedButton(
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary.copy(alpha = 0f)),
        shape = MaterialTheme.shapes.large,
        onClick = {}
    ) {
        Text(
            color = MaterialTheme.colors.secondary,
            text = "Log in"
        )
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Preview(widthDp = 673, heightDp = 841)
@Composable
fun WelcomePreview() {
    BloomTheme {
        WelcomeScreen()
    }
}