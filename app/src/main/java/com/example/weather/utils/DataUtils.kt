package com.example.weather.utils

import com.example.weather.model.FactDTO
import com.example.weather.model.WeatherDTO
import com.example.weather.model.Weather
import com.example.weather.model.getDefaultCity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(Weather(getDefaultCity(), fact.temp!!, fact.feels_like!!, fact.condition!!, fact.icon))
}