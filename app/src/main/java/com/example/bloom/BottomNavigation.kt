package com.example.bloom

import android.content.res.Configuration
import android.graphics.Color.alpha
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.bloom.ui.theme.BloomTheme
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
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



@Composable
fun BloomBottomNav() {
    BottomNavigation {
        HomeNavItem()
        FavoritesNavItem()
        ProfileNavItem()
        CartNavItem()
    }
}

@Composable
fun HomeNavItem() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Filled.Home,
            contentDescription = stringResource(R.string.Home)
        )
        Text(
            text = stringResource(id = R.string.Home)
        )
    }
}

@Composable
fun FavoritesNavItem() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Filled.FavoriteBorder,
            contentDescription = stringResource(R.string.Favorites)
        )
        Text(
            text = stringResource(id = R.string.Favorites)
        )
    }
}

@Composable
fun ProfileNavItem() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Filled.AccountCircle,
            contentDescription = stringResource(R.string.Profile)
        )
        Text(
            text = stringResource(id = R.string.Profile)
        )
    }
}

@Composable
fun CartNavItem() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Filled.ShoppingCart,
            contentDescription = stringResource(R.string.Cart)
        )
        Text(
            text = stringResource(id = R.string.Cart)
        )
    }
}

@Preview
@Composable
fun BloomBottomNavPreview() {
    BloomTheme {
        BloomBottomNav()
    }
}