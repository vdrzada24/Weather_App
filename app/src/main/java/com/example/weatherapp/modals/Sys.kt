package com.example.weatherapp.modals

import java.io.Serial
import java.io.Serializable

data class Sys(
    val type: Int,
    val id: Int,
    val country: String,
    val sunrise: Long,
    val sunset: Long
): Serializable
