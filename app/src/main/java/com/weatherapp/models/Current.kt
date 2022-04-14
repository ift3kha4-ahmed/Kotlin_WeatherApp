package com.weatherapp.models

import java.io.Serializable

data class Current (
        val dt:Long,
        val sunrise: Long,
        val sunset:Long,
        val temp:Float,
        val feels_like:Float,
        val pressure:Int,
        val humidity:Int,
        val dew_point:Float,
        val uvi:Int,
        val clouds:Int,
        val visibility:Long,
        val wind_speed:Float,
        val wind_deg:Float,
        val weather:List<Weather>


        ): Serializable
