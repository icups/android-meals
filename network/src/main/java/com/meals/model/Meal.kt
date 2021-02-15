package com.meals.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
class Meal(
    @Json(name = "idMeal") val id: Long = 1L,
    @Json(name = "strMeal") val name: String = "",
    @Json(name = "strMealThumb") val thumbnail: String = "",
    @Json(name = "strInstructions") val instruction: String = "",
    @Json(name = "strCategory") val category: String = ""
) : Parcelable