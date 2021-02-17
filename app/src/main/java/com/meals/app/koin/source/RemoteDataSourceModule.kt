package com.meals.app.koin.source

import com.meals.services.MealServices
import org.koin.dsl.module
import retrofit2.Retrofit

val remoteDataSource = module {
    factory { provideMealServices(get()) }
}

fun provideMealServices(retrofit: Retrofit): MealServices {
    return retrofit.create(MealServices::class.java)
}