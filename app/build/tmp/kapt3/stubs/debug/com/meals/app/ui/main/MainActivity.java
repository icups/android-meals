package com.meals.app.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\bH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0014J\b\u0010\u0011\u001a\u00020\bH\u0014J\b\u0010\u0012\u001a\u00020\bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/meals/app/ui/main/MainActivity;", "Lcom/meals/app/base/BaseActivity;", "Lcom/meals/app/ui/main/MealViewModel;", "Lcom/meals/app/databinding/ActivityMainBinding;", "()V", "adapter", "Lcom/meals/app/ui/meal/MealAdapter;", "goToDetails", "", "id", "", "(Ljava/lang/Long;)V", "initAPI", "layoutResources", "", "onBackPressed", "onViewCreated", "setupAdapter", "setupObserver", "Companion", "app_debug"})
public final class MainActivity extends com.meals.app.base.BaseActivity<com.meals.app.ui.main.MealViewModel, com.meals.app.databinding.ActivityMainBinding> {
    private com.meals.app.ui.meal.MealAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public static final com.meals.app.ui.main.MainActivity.Companion Companion = null;
    
    @java.lang.Override()
    protected int layoutResources() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onViewCreated() {
    }
    
    @java.lang.Override()
    protected void initAPI() {
    }
    
    @java.lang.Override()
    protected void setupAdapter() {
    }
    
    @java.lang.Override()
    protected void setupObserver() {
    }
    
    private final void goToDetails(java.lang.Long id) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public MainActivity() {
        super(null);
    }
    
    public static final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/meals/app/ui/main/MainActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}