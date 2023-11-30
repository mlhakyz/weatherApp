package com.example.weatherapp.service

import com.example.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET

//https://api.openweathermap.org/data/2.5/weather?q=izmir&APPID=f5df602fb3079403ffd11dda9a219aa3
interface WeatherAPI {
    @GET("data/2.5/weather?q=izmir&APPID=f5df602fb3079403ffd11dda9a219aa3")
    fun getData():Single<WeatherModel>
}