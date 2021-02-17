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

class MealViewModel(private val repository: MealRepository) : ViewModel() {

    enum class UiRequest { DETAIL_MEAL }
    enum class UiMode { INITIATE, ON_PROGRESS, NOT_FOUND, SUCCESS, ERROR }

    data class Parcel(val id: Long? = null)

    private val mUiRequest = MutableLiveData<Pair<UiRequest, Parcel>>()
    val uiRequest: LiveData<Pair<UiRequest, Parcel>> = mUiRequest

    private val mUiMode = MutableLiveData(UiMode.INITIATE)
    val uiMode: LiveData<UiMode> = mUiMode

    private val mMeals = MutableLiveData<State<List<Meal>>>()
    val meals: LiveData<State<List<Meal>>> = mMeals

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    fun fetchRandomMeals() {
        viewModelScope.launch {
            mUiMode.postValue(UiMode.ON_PROGRESS)
            try {
                repository.randomMeals().run {
                    mMeals.postValue(State.Success(result))
                    mUiMode.postValue(UiMode.SUCCESS)
                }
            } catch (e: Exception) {
                mMeals.postValue(when (e) {
                    is UnknownHostException -> State.Failure("Please check your internet connection and try again.")
                    else -> State.Failure(e.message)
                })
                mUiMode.postValue(UiMode.ERROR)
                e.printStackTrace()
            }
        }
    }

    fun fetchMealDetail(id: String) {
        viewModelScope.launch {
            mUiMode.postValue(UiMode.ON_PROGRESS)
            try {
                repository.mealDetail(id).run {
                    mMeals.postValue(State.Success(result))
                    mUiMode.postValue(UiMode.SUCCESS)
                }
            } catch (e: Exception) {
                mMeals.postValue(when (e) {
                    is UnknownHostException -> State.Failure("Please check your internet connection and try again.")
                    else -> State.Failure(e.message)
                })
                mUiMode.postValue(UiMode.ERROR)
                e.printStackTrace()
            }
        }
    }

    // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --

    fun clickDetailMeal(data: Long) {
        mUiRequest.postValue(UiRequest.DETAIL_MEAL to Parcel(id = data))
    }

}