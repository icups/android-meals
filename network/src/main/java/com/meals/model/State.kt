package com.meals.model

import com.meals.exception.NetworkException

sealed class State<out T> {
    data class Success<out T>(val data: T) : State<T>()
    data class Failure(val message: String?) : State<Nothing>()
}