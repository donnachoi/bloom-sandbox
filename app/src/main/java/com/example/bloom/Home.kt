package com.example.bloom

import android.content.res.Configuration
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

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomTheme {
                // A surface container using the 'background' color from the theme
                HomeScreen()
                BloomBottomNav()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
//            DetailHero()
            DetailContent()
            MoreDetail()
            RelatedCollections()
            BloomBottomNav()
        }
    }
}

@Preview(
    device = "spec:width=1080px,height=1920px,dpi=480,isRound=false,chinSize=0px",
    showSystemUi = true, apiLevel = 30,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_TELEVISION,

)
@Preview()
@Composable
fun HomePreview() {
    BloomTheme {
        HomeScreen()
    }
}
