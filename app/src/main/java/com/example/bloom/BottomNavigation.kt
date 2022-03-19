package com.example.bloom

import android.content.res.Configuration
import android.graphics.Color.alpha
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.bloom.ui.theme.BloomTheme
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource

class BottomNav : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomTheme {
                // A surface container using the 'background' color from the theme
                BloomBottomNav()
            }
        }
    }
}

val items = listOf("Songs", "Artists", "Playlists")

@Composable
fun BloomBottomNav() {
    BottomNavigation {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
            )
        }
    }
}

@Composable
fun BottomNavigationItem() {
    Text(
        text = "Log in with email",
    )
}

@Preview
@Composable
fun BloomBottomNavPreview() {
    BloomTheme {
        BloomBottomNav()
    }
}