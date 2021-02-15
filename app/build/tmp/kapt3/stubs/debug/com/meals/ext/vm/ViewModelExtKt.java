package com.meals.ext.vm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00010\b\u001aA\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00010\b\u001aA\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00010\b\u00a8\u0006\r"}, d2 = {"observe", "", "T", "owner", "Landroidx/lifecycle/LifecycleOwner;", "data", "Landroidx/lifecycle/LiveData;", "function", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/fragment/app/Fragment;", "app_debug"})
public final class ViewModelExtKt {
    
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function) {
    }
    
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function) {
    }
    
    public static final <T extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function) {
    }
}