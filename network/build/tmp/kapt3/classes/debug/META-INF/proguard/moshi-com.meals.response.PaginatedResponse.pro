-if class com.meals.response.PaginatedResponse
-keepnames class com.meals.response.PaginatedResponse
-if class com.meals.response.PaginatedResponse
-keep class com.meals.response.PaginatedResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi,java.lang.reflect.Type[]);
}
-if class com.meals.response.PaginatedResponse
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.meals.response.PaginatedResponse
-keepclassmembers class com.meals.response.PaginatedResponse {
    public synthetic <init>(int,java.util.List,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
