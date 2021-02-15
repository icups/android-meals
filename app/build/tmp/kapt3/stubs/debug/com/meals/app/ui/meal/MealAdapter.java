package com.meals.app.ui.meal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nH\u0014\u00a8\u0006\u0011"}, d2 = {"Lcom/meals/app/ui/meal/MealAdapter;", "Lcom/meals/app/base/BaseSingleAdapter;", "Lcom/meals/model/Meal;", "Lcom/meals/app/databinding/ItemMealBinding;", "()V", "animated", "", "getItemId", "", "position", "", "layoutResources", "onBindBaseViewHolder", "", "binding", "data", "adapterPosition", "app_debug"})
public final class MealAdapter extends com.meals.app.base.BaseSingleAdapter<com.meals.model.Meal, com.meals.app.databinding.ItemMealBinding> {
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    protected void onBindBaseViewHolder(@org.jetbrains.annotations.NotNull()
    com.meals.app.databinding.ItemMealBinding binding, @org.jetbrains.annotations.NotNull()
    com.meals.model.Meal data, int adapterPosition) {
    }
    
    @java.lang.Override()
    protected int layoutResources() {
        return 0;
    }
    
    @java.lang.Override()
    protected boolean animated() {
        return false;
    }
    
    public MealAdapter() {
        super(null);
    }
}