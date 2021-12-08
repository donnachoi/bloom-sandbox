package com.example.bloom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
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
    Surface(color = MaterialTheme.colors.background) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Name()
            Description()
            ButtonCreate()
            ButtonLogin()
        }
    }
}

@Composable
fun Name() {
    Text(text = "Bloom")
}

@Composable
fun Description() {
    Text(text = "Beautiful home garden solutions")
}

@Composable
fun ButtonCreate() {
    Button(
        onClick = {}
    ) {
        Text("Create account")
    }
}

@Composable
fun ButtonLogin() {
    OutlinedButton(
        onClick = {}
    ) {
        Text("Log in")
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun WelcomePreview() {
    BloomTheme {
        WelcomeScreen()
    }
}