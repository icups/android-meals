package com.meals.services

import com.meals.model.Meal
import com.meals.response.PaginatedResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UserServices {

    @GET("{api_key}/random.php")
    suspend fun randomMeals(
        @Path("api_key") requestId: String
    ): PaginatedResponse<Meal>

}