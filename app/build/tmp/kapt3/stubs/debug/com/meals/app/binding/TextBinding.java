package com.meals.app.binding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/meals/app/binding/TextBinding;", "", "()V", "bindText", "", "textView", "Landroid/widget/TextView;", "data", "", "bindTextColor", "hexCode", "setBoldText", "enabled", "setHtmlText", "setItalicText", "setStrikeThrough", "", "app_debug"})
public final class TextBinding {
    @org.jetbrains.annotations.NotNull()
    public static final com.meals.app.binding.TextBinding INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"bindText"})
    public static final void bindText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bindTextColor"})
    public static final void bindTextColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String hexCode) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"italic"})
    public static final void setItalicText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String enabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bold"})
    public static final void setBoldText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String enabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"strikeThrough"})
    public static final void setStrikeThrough(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, boolean enabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"htmlText"})
    public static final void setHtmlText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    private TextBinding() {
        super();
    }
}