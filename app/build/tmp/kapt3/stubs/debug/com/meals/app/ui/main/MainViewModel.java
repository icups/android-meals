package com.meals.app.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/meals/app/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/meals/app/repository/MealRepository;", "(Lcom/meals/app/repository/MealRepository;)V", "mMeals", "Landroidx/lifecycle/MutableLiveData;", "Lcom/meals/model/State;", "", "Lcom/meals/model/Meal;", "mUiMode", "Lcom/meals/app/ui/main/MainViewModel$UiMode;", "kotlin.jvm.PlatformType", "mUiRequest", "Lcom/meals/app/ui/main/MainViewModel$UiRequest;", "meals", "Landroidx/lifecycle/LiveData;", "getMeals", "()Landroidx/lifecycle/LiveData;", "uiMode", "getUiMode", "uiRequest", "getUiRequest", "clickGetRandomMeal", "", "fetchRandomMeals", "apiKey", "", "UiMode", "UiRequest", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.meals.app.ui.main.MainViewModel.UiRequest> mUiRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.meals.app.ui.main.MainViewModel.UiRequest> uiRequest = null;
    private final androidx.lifecycle.MutableLiveData<com.meals.app.ui.main.MainViewModel.UiMode> mUiMode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.meals.app.ui.main.MainViewModel.UiMode> uiMode = null;
    private final androidx.lifecycle.MutableLiveData<com.meals.model.State<java.util.List<com.meals.model.Meal>>> mMeals = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.meals.model.State<java.util.List<com.meals.model.Meal>>> meals = null;
    private final com.meals.app.repository.MealRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.meals.app.ui.main.MainViewModel.UiRequest> getUiRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.meals.app.ui.main.MainViewModel.UiMode> getUiMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.meals.model.State<java.util.List<com.meals.model.Meal>>> getMeals() {
        return null;
    }
    
    public final void fetchRandomMeals(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
    }
    
    public final void clickGetRandomMeal() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.meals.app.repository.MealRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/meals/app/ui/main/MainViewModel$UiRequest;", "", "(Ljava/lang/String;I)V", "GET_RANDOM", "DETAIL_MEAL", "app_debug"})
    public static enum UiRequest {
        /*public static final*/ GET_RANDOM /* = new GET_RANDOM() */,
        /*public static final*/ DETAIL_MEAL /* = new DETAIL_MEAL() */;
        
        UiRequest() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/meals/app/ui/main/MainViewModel$UiMode;", "", "(Ljava/lang/String;I)V", "INITIATE", "ON_PROGRESS", "NOT_FOUND", "SUCCESS", "ERROR", "app_debug"})
    public static enum UiMode {
        /*public static final*/ INITIATE /* = new INITIATE() */,
        /*public static final*/ ON_PROGRESS /* = new ON_PROGRESS() */,
        /*public static final*/ NOT_FOUND /* = new NOT_FOUND() */,
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ ERROR /* = new ERROR() */;
        
        UiMode() {
        }
    }
}