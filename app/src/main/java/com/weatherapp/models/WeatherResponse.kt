package com.weatherapp.models

import java.io.Serializable

data class WeatherResponse(
    val lat: Double,
    val lon: Double,
    val timezone: String,
    val timezone_offset: Long,
    val current: Current
) : Serializable