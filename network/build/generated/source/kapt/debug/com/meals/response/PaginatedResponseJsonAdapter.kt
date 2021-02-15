// Code generated by moshi-kotlin-codegen. Do not edit.
package com.meals.response

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import java.lang.reflect.Type
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION", "RedundantExplicitType",
    "LocalVariableName")
class PaginatedResponseJsonAdapter<T>(
  moshi: Moshi,
  types: Array<Type>
) : JsonAdapter<PaginatedResponse<T>>() {
  init {
    require(types.size == 1) {
      buildString { append("TypeVariable mismatch: Expecting ").append(1).append(" type for generic type variables [").append("T").append("], but received ").append(types.size) }
    }
  }

  private val options: JsonReader.Options = JsonReader.Options.of("total_count", "meals", "message")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(),
      "totalCount")

  private val listOfTNullableAnyAdapter: JsonAdapter<List<T>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, types[0]), emptySet(), "result")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "message")

  @Volatile
  private var constructorRef: Constructor<PaginatedResponse<T>>? = null

  override fun toString(): String = buildString(39) {
      append("GeneratedJsonAdapter(").append("PaginatedResponse").append(')') }

  override fun fromJson(reader: JsonReader): PaginatedResponse<T> {
    var totalCount: Int? = 0
    var result: List<T>? = null
    var message: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          totalCount = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("totalCount",
              "total_count", reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          result = listOfTNullableAnyAdapter.fromJson(reader) ?: throw Util.unexpectedNull("result",
              "meals", reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          message = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    @Suppress("UNCHECKED_CAST")
    val localConstructor: Constructor<PaginatedResponse<T>> = this.constructorRef ?:
        (PaginatedResponse::class.java.getDeclaredConstructor(Int::class.javaPrimitiveType,
        List::class.java, String::class.java, Int::class.javaPrimitiveType,
        Util.DEFAULT_CONSTRUCTOR_MARKER) as Constructor<PaginatedResponse<T>>).also {
        this.constructorRef = it }
    return localConstructor.newInstance(
        totalCount,
        result,
        message,
        mask0,
        null
    )
  }

  override fun toJson(writer: JsonWriter, value: PaginatedResponse<T>?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("total_count")
    intAdapter.toJson(writer, value.totalCount)
    writer.name("meals")
    listOfTNullableAnyAdapter.toJson(writer, value.result)
    writer.name("message")
    nullableStringAdapter.toJson(writer, value.message)
    writer.endObject()
  }
}