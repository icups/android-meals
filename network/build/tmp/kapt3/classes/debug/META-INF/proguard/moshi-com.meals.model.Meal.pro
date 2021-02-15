-if class com.meals.model.Meal
-keepnames class com.meals.model.Meal
-if class com.meals.model.Meal
-keep class com.meals.model.MealJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.meals.model.Meal
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.meals.model.Meal
-keepclassmembers class com.meals.model.Meal {
    public synthetic <init>(long,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
