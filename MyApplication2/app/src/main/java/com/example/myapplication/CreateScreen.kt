package com.example.myapplication

import android.R.attr.description
import android.R.attr.name
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.personaje
import com.example.myapplication.data.personajeList


@Composable
fun CreateScreen(modifier: Modifier = Modifier, onCancel: () -> Unit) {
    var name by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var skills by remember { mutableStateOf("") }

    LazyColumn(modifier = modifier.fillMaxSize()) {
        item {
            TextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Nombre del personaje") },
                modifier = modifier.fillMaxWidth()
            )
            TextField(
                value = description,
                onValueChange = { description = it },
                label = { Text("Descripción del personaje") },
                modifier = modifier.fillMaxWidth()
            )
            TextField(
                value = skills,
                onValueChange = { skills = it },
                label = { Text("Habilidades del personaje") },
                modifier = modifier.fillMaxWidth()
            )
            Button(
                onClick = {
                    personajeList.add(
                        personaje(name, description, skills)
                    )
                    onCancel()
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("Guardar")
            }
            Button(onClick = onCancel) {
                Text("Volver")
            }
        }
    }
}

