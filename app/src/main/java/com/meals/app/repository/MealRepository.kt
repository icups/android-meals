package com.meals.app.repository

import com.meals.database.UserDatabase
import com.meals.model.Meal
import com.meals.response.PaginatedResponse
import com.meals.services.UserServices

class MealRepository(private val remoteDataSource: UserServices, private val localDataSource: UserDatabase) {

    suspend fun randomMeals(keyword: String): PaginatedResponse<Meal> {
        return remoteDataSource.randomMeals(keyword)
    }

}