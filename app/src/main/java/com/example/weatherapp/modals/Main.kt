package com.example.weatherapp.modals

import java.io.Serializable

data class Main(
    val temp: Double,
    val feels_like:Double,
    val pressure: Double,
    val temp_min: Double,
    val temp_max: Double,
    val humidity: Int,
    val sea_level: Int,
    val grnd_level: Int

): Serializable
