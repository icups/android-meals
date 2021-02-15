package com.meals.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0018H%J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0015H$J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0014J\b\u0010\u001f\u001a\u00020\u0015H\u0014J\b\u0010 \u001a\u00020\u0015H\u0014J\b\u0010!\u001a\u00020\u0015H\u0014J\b\u0010\"\u001a\u00020\u0015H\u0014R\u001c\u0010\t\u001a\u00028\u0001X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00028\u00008VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/meals/app/base/BaseActivity;", "VM", "Landroidx/lifecycle/ViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "viewModelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "attachViewDataBinding", "", "initAPI", "layoutResources", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setPortraitOrientation", "setupAdapter", "setupListener", "setupObserver", "setupToolbar", "setupView", "app_debug"})
public abstract class BaseActivity<VM extends androidx.lifecycle.ViewModel, VDB extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    public VDB binding;
    private final java.lang.Class<VM> viewModelClass = null;
    
    @org.jetbrains.annotations.NotNull()
    public VM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VDB getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    VDB p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setPortraitOrientation() {
    }
    
    private final void attachViewDataBinding() {
    }
    
    protected abstract void onViewCreated();
    
    protected void setupView() {
    }
    
    protected void setupAdapter() {
    }
    
    protected void setupToolbar() {
    }
    
    protected void setupListener() {
    }
    
    protected void setupObserver() {
    }
    
    protected void initAPI() {
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int layoutResources();
    
    public BaseActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> viewModelClass) {
        super();
    }
}