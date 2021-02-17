package com.meals.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Response<T>(
    val page: Int = 0,
    @Json(name = "total_results") val totalResult: Int = 0,
    @Json(name = "total_pages") val totalPages: Int = 0,
    @Json(name = "meals") val result: T
) : Serializable