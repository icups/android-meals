package com.meals.services

import com.meals.model.Meal
import com.meals.response.PaginatedResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MealServices {

    @GET("{api_key}/randomselection.php")
    suspend fun randomMeals(
        @Path("api_key") requestId: String
    ): PaginatedResponse<Meal>

    @GET("{api_key}/lookup.php")
    suspend fun mealDetail(
        @Path("api_key") requestId: String,
        @Query("i") idMeal: String,
    ): PaginatedResponse<Meal>

}