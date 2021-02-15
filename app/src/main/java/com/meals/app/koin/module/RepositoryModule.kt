package com.meals.app.koin.module

import com.meals.app.repository.MealRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory { MealRepository(get(), get()) }
}