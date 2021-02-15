package com.meals.app.koin.source

import com.meals.database.UserDatabase
import org.koin.dsl.module

val localDataSourceModule = module {
    factory { UserDatabase.getInstance(get()) }
}