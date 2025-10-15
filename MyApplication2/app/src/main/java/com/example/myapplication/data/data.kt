package com.example.myapplication.data

data class personaje(val name:String, val description: String, val skills: String)

var personajeList: MutableList<personaje> = mutableListOf()