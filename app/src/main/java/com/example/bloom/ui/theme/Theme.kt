package com.example.bloom.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Green900,
    primaryVariant = Gray,
    secondary = Green300,
    background = Gray,
    surface = White150,
    onPrimary = Color.White,
    onSecondary = Gray,
    onBackground = Color.White,
    onSurface = White850
)

private val LightColorPalette = lightColors(
    primary = Pink100,
    primaryVariant = Pink50,
    secondary = Pink900,
    background = Color.White,
    surface = White850,
    onPrimary = Gray,
    onSecondary = Color.White,
    onBackground = Gray,
    onSurface = Gray

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun BloomTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = BloomTypography,
        shapes = BloomShapes,
        content = content
    )
}

