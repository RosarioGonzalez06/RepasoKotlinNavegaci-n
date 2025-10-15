package com.example.myapplication

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.navigation
import androidx.navigation.toRoute


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "App de repaso"
                    )
                }
            )
        },
    ) { innerPadding ->
        NavHost(navController= navController, startDestination = Destinations.Principal){
            val hostModifier= Modifier.consumeWindowInsets(innerPadding).padding(innerPadding)
            composable <Destinations.Principal>{
                principalScreen(
                    modifier = hostModifier,
                    onNavigateToDetail = {
                            navController.navigate(Destinations.Detail)
                    },
                    onNavigateToCreate = {
                        navController.navigate(Destinations.Create)
                    }
                )
            }
            composable <Destinations.Detail>{
                detailScreen(
                    modifier = hostModifier,
                    onCancel = {
                        navController.popBackStack()
                    })
            }
            composable <Destinations.Create>{
                CreateScreen(
                    modifier = hostModifier,
                    onCancel = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}


