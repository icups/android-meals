package com.meals.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0014J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0013\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0007H$J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0014\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010 \u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u0014\u0010!\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/meals/app/base/BasePagerAdapter;", "T", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "manager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "currentPosition", "", "list", "", "titles", "", "getAll", "", "getBundle", "Landroid/os/Bundle;", "position", "getCount", "getData", "(I)Ljava/lang/Object;", "getFragment", "Landroidx/fragment/app/Fragment;", "getItem", "getItemPosition", "object", "", "getPageTitle", "", "initializePagerData", "", "data", "(Ljava/lang/Object;)V", "initializeTitles", "replace", "setCurrentPosition", "app_debug"})
public abstract class BasePagerAdapter<T extends java.lang.Object> extends androidx.fragment.app.FragmentStatePagerAdapter {
    private final java.util.List<java.lang.String> titles = null;
    private final java.util.List<T> list = null;
    private int currentPosition = 0;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemPosition(@org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getAll() {
        return null;
    }
    
    public final T getData(int position) {
        return null;
    }
    
    public final void initializeTitles(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> data) {
    }
    
    public final void initializePagerData(T data) {
    }
    
    public final void initializePagerData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> data) {
    }
    
    public final void replace(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.fragment.app.Fragment getFragment(int position);
    
    @org.jetbrains.annotations.NotNull()
    protected android.os.Bundle getBundle(int position) {
        return null;
    }
    
    public final void setCurrentPosition(int position) {
    }
    
    public BasePagerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager) {
        super(null);
    }
}