package com.meals.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\b\u0010\u0012\u001a\u00020\fH$J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010 \u001a\u00020\u000eH\u0014J\b\u0010!\u001a\u00020\u000eH\u0014J\b\u0010\"\u001a\u00020\u000eH\u0014R\u001c\u0010\u0005\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006#"}, d2 = {"Lcom/meals/app/base/BaseSheet;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "mViewDataBinding", "getMViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setMViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "dialogStyle", "", "initAPI", "", "initAdapter", "initView", "initViewPager", "layoutResources", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onBaseViewCreated", "view", "Landroid/view/View;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "setupAdapter", "setupFragmentObserver", "setupListener", "app_debug"})
public abstract class BaseSheet<VDB extends androidx.databinding.ViewDataBinding> extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    public VDB mViewDataBinding;
    
    @org.jetbrains.annotations.NotNull()
    public final VDB getMViewDataBinding() {
        return null;
    }
    
    public final void setMViewDataBinding(@org.jetbrains.annotations.NotNull()
    VDB p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected void onBaseViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected void setupAdapter() {
    }
    
    protected void setupListener() {
    }
    
    protected void setupFragmentObserver() {
    }
    
    protected void initView() {
    }
    
    protected void initViewPager() {
    }
    
    protected void initAdapter() {
    }
    
    protected void initAPI() {
    }
    
    protected abstract int layoutResources();
    
    protected int dialogStyle() {
        return 0;
    }
    
    public BaseSheet() {
        super();
    }
}