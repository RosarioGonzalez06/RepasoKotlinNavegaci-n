package com.example.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun detailScreen(modifier: Modifier, onCancel: () -> Unit) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        item {
            Text(
                text = "Esta es una app para poder crear personajes, simplemente tienes que pulsar crear personaje, rellenar los datos y te aparecera en la pantalla principal",
                modifier = Modifier.padding(16.dp)
            )
            Button(
                onClick = onCancel,
            ) {
                Text("Volver")
            }
        }
    }
}