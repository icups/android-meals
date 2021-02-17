package com.meals.app.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/meals/app/repository/MealRepository;", "", "remoteDataSource", "Lcom/meals/services/UserServices;", "localDataSource", "Lcom/meals/database/UserDatabase;", "(Lcom/meals/services/UserServices;Lcom/meals/database/UserDatabase;)V", "mealDetail", "Lcom/meals/response/PaginatedResponse;", "Lcom/meals/model/Meal;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "randomMeals", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MealRepository {
    private final com.meals.services.UserServices remoteDataSource = null;
    private final com.meals.database.UserDatabase localDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object randomMeals(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.meals.response.PaginatedResponse<com.meals.model.Meal>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object mealDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.meals.response.PaginatedResponse<com.meals.model.Meal>> p1) {
        return null;
    }
    
    public MealRepository(@org.jetbrains.annotations.NotNull()
    com.meals.services.UserServices remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.meals.database.UserDatabase localDataSource) {
        super();
    }
}