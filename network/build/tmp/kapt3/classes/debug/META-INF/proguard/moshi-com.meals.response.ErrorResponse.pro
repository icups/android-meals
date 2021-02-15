-if class com.meals.response.ErrorResponse
-keepnames class com.meals.response.ErrorResponse
-if class com.meals.response.ErrorResponse
-keep class com.meals.response.ErrorResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.meals.response.ErrorResponse
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.meals.response.ErrorResponse
-keepclassmembers class com.meals.response.ErrorResponse {
    public synthetic <init>(java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
