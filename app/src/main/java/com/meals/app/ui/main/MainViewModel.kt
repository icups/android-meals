package com.meals.app.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.meals.app.repository.MealRepository
import com.meals.model.Meal
import com.meals.model.State
import kotlinx.coroutines.launch
import java.net.UnknownHostException

class MainViewModel(private val repository: MealRepository) : ViewModel() {

    enum class UiRequest { GET_RANDOM, DETAIL_MEAL }
    enum class UiMode { INITIATE, ON_PROGRESS, NOT_FOUND, SUCCESS, ERROR }

    private val mUiRequest = MutableLiveData<UiRequest>()
    val uiRequest: LiveData<UiRequest> = mUiRequest

    private val mUiMode = MutableLiveData(UiMode.INITIATE)
    val uiMode: LiveData<UiMode> = mUiMode

    private val mMeals = MutableLiveData<State<List<Meal>>>()
    val meals: LiveData<State<List<Meal>>> = mMeals

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    fun fetchRandomMeals(apiKey: String) {
        viewModelScope.launch {
            mUiMode.postValue(UiMode.ON_PROGRESS)
            try {
                repository.randomMeals(apiKey).run {
                    mMeals.postValue(State.Success(result))
                    mUiMode.postValue(UiMode.SUCCESS)
                }
            } catch (e: Exception) {
                mMeals.postValue(when (e) {
                    is UnknownHostException -> State.Failure("Please check your internet connection and try again.")
                    else -> State.Failure(e.message)
                })
                mUiMode.postValue(UiMode.ERROR)
            }
        }
    }

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    fun clickGetRandomMeal() {
        mUiRequest.postValue(UiRequest.GET_RANDOM)
    }

}