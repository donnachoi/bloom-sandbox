package com.example.bloom

import android.graphics.Color.alpha
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.bloom.ui.theme.BloomTheme

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomTheme {
                // A surface container using the 'background' color from the theme
                LoginScreen()
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Surface(color = MaterialTheme.colors.primaryVariant) {
        LoginContent()
    }
}

@Composable
fun LoginContent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Text(
            text = "Log in with email",
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        TextFieldEmail()
        TextFieldPassword()
        Text(
            text = "By clicking below, you agree to our Terms of Use and consent to our Privacy Policy.",
            style = MaterialTheme.typography.caption.copy(textAlign = TextAlign.Center),
            color = MaterialTheme.colors.onPrimary,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        ButtonLogin()
    }
}

@Composable
fun TextFieldEmail() {
    val textState = remember { mutableStateOf(TextFieldValue()) }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        value = textState.value,
        onValueChange = { textState.value = it },
        placeholder = {
            Text(text = "Email address")
        },
    )
}


@Composable
fun TextFieldPassword() {
    val textState = remember { mutableStateOf(TextFieldValue()) }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = textState.value,
        onValueChange = { textState.value = it },
        placeholder = {
            Text(text = "Password (8+ characters)")
        },
    )
}

@Composable
private fun ButtonLogin() {
    val buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.secondary,
        contentColor = MaterialTheme.colors.background
    )
    Button(
        modifier = Modifier.fillMaxWidth(),
        colors = buttonColors,
        shape = MaterialTheme.shapes.large,
        onClick = {}
    ) {
        Text(
            text = "Log in",
            Modifier.padding(4.dp)
        )
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Preview(widthDp = 673, heightDp = 841)
@Composable
fun LoginPreview() {
    BloomTheme {
        LoginScreen()
    }
}