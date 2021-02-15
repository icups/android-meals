package com.meals.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/meals/model/Meal;", "Landroid/os/Parcelable;", "id", "", "name", "", "thumbnail", "instruction", "category", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getId", "()J", "getInstruction", "getName", "getThumbnail", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "network_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Meal implements android.os.Parcelable {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String thumbnail = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String instruction = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String category = null;
    public static final android.os.Parcelable.Creator<com.meals.model.Meal> CREATOR = null;
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumbnail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInstruction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public Meal(@com.squareup.moshi.Json(name = "idMeal")
    long id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strMeal")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strMealThumb")
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strInstructions")
    java.lang.String instruction, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strCategory")
    java.lang.String category) {
        super();
    }
    
    public Meal() {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.meals.model.Meal> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.meals.model.Meal[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.meals.model.Meal createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}