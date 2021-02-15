package com.meals.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class PaginatedResponse<T>(
    @Json(name = "total_count") val totalCount: Int = 0,
    @Json(name = "meals") val result: List<T> = ArrayList(),
    val message: String? = null,
) : Serializable