package com.oguzdogdu.composenavdrawer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.oguzdogdu.composenavdrawer.common.GmailAppBar
import com.oguzdogdu.composenavdrawer.common.GmailDrawerMenu
import com.oguzdogdu.composenavdrawer.ui.theme.ComposeNavDrawerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavDrawerTheme {
                window?.statusBarColor = Color.White.toArgb()
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { GmailAppBar(scaffoldState, coroutineScope) },
        drawerContent = {
            GmailDrawerMenu()
        }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeNavDrawerTheme {
       GmailApp()
    }
}