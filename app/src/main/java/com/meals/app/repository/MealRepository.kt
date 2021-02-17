package com.meals.app.repository

import com.meals.app.BuildConfig
import com.meals.database.UserDatabase
import com.meals.model.Meal
import com.meals.response.PaginatedResponse
import com.meals.services.MealServices

class MealRepository(private val remoteDataSource: MealServices, private val localDataSource: UserDatabase) {

    suspend fun randomMeals(): PaginatedResponse<Meal> {
        return remoteDataSource.randomMeals(BuildConfig.API_KEY)
    }

    suspend fun mealDetail(id: String): PaginatedResponse<Meal> {
        return remoteDataSource.mealDetail(BuildConfig.API_KEY, id)
    }

}