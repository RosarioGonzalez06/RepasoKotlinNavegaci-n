package com.example.myapplication

import kotlinx.serialization.Serializable

@Serializable
sealed class Destinations (val route:String) {
    @Serializable
    object Principal: Destinations("PrincipalScreen")
    @Serializable
    object Detail: Destinations("DetailScreen")
    @Serializable
    object Create: Destinations("CreateScreen")
}