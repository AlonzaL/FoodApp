package com.example.foodapp.Activity.Dashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun MainScreen() {
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        bottomBar = {
            MyBottomBar()
        },
        scaffoldState = scaffoldState
    ) { paddingValues ->

    }
}