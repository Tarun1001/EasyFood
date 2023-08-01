package com.example.easyfood.Retrofit

import com.example.easyfood.Pojo.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {
    @GET("random.php")
    fun getRandomMeal(): Call<MealList>
}