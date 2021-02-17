package com.meals.app.koin.module


import com.meals.app.ui.main.MealViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MealViewModel(get()) }
}