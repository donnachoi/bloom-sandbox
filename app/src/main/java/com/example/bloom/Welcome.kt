package com.example.bloom

import android.content.res.Configuration
import android.graphics.Color.alpha
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
            Description("Beautiful")
            Description("Tidy")
            ButtonCreate()
            ButtonLogin()
        }
    }
}

@Composable
fun WelcomeBgImage() {
    val image: Painter = painterResource(id = R.drawable.welcome_bg)
    Image(
        painter = image,
        contentDescription = "",
        contentScale = ContentScale.FillWidth,
        alpha = 0.75f,
        modifier = Modifier
            .fillMaxSize(1f)
            .zIndex(-2f)
    )
}

@Composable
fun WelcomeSplashImage() {
        val image: Painter = painterResource(id = R.drawable.welcome_illos)
        Image(
            painter = image,
            contentDescription = "",
            modifier = Modifier
                .offset(x = 60.dp, y = 30.dp)
                .fillMaxWidth(1f)
                .padding(bottom = 50.dp)
        )
}

@Composable
fun Name() {
    val image: Painter = painterResource(id = R.drawable.logo)
    Image(
        painter = image,
        contentDescription = "",
    )
}

@Composable
fun Description(adjective: String): String {
//    val adjective = "Beautiful"
    val description = "$adjective home garden solutions"
    Text(
        text = description,
        modifier = Modifier.padding(bottom = 20.dp)
    )
    return "$description"
}

@Composable
fun disclaimer() {
    val description = "hello"
    Text(
        text = description
    )
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
        modifier = Modifier.fillMaxWidth(0.9f),
        onClick = {},
    ) {
        Text("Create account")
    }
}

@Composable
private fun ButtonLogin() {
    val buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.primary.copy(alpha = 0f),
        contentColor = MaterialTheme.colors.secondary,
    )
    TextButton(
        colors = buttonColors,
        shape = MaterialTheme.shapes.large,
//        border = BorderStroke(0.dp),
        elevation = ButtonDefaults.elevation(0.dp),
        modifier = Modifier.fillMaxWidth(0.9f),
        onClick = {}
    ) {
        Text(
            text = "Log in"
        )
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Preview(widthDp = 360, heightDp = 640,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
@Preview(widthDp = 673, heightDp = 841)
@Composable
fun WelcomePreview() {
    BloomTheme {
        WelcomeScreen()
    }
}