package com.example.myapplication

import android.R.attr.button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.personaje
import com.example.myapplication.data.personajeList
import androidx.compose.foundation.lazy.items


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun principalScreen (modifier: Modifier,onNavigateToDetail: ()-> Unit,onNavigateToCreate: () -> Unit) {
    Column(modifier = modifier.fillMaxSize()) {
        Button(
            onClick = onNavigateToDetail, modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text("Presiona para ver detalles")
        }
        Button(onClick = onNavigateToCreate) {
            Text("Crear")
        }
        LazyColumn {
            items(personajeList) { personaje ->
                Text("Nombre: ${personaje.name}")
                Text("Descripción: ${personaje.description}")
                Text("Habilidades: ${personaje.skills}")
            }
        }
    }
}
