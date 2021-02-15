package com.meals.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0015\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0006\u0010\u0018\u001a\u00020\u0012J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002J\u0006\u0010 \u001a\u00020\u001aJ\u001d\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010#\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010$J%\u0010%\u001a\u00020\u00122\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010#\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u001aH\u0014\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u001aJ\u0012\u0010+\u001a\u00020\u001a2\b\b\u0002\u0010,\u001a\u00020\u001aH\u0014J%\u0010-\u001a\u00020\u00122\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010#\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u001aH$\u00a2\u0006\u0002\u0010\'J\u001d\u0010.\u001a\u00020\u00122\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010/\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u00100J\u0015\u00101\u001a\u00028\u00012\u0006\u00102\u001a\u000203H$\u00a2\u0006\u0002\u00104J\u001d\u00105\u001a\u00028\u00012\u0006\u00106\u001a\u0002072\u0006\u0010\u001f\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u00108J\u000e\u00109\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u001aJ\u0013\u0010:\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010;\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u0010\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\nH\u0002J%\u0010>\u001a\u00020\u00122\u0006\u0010#\u001a\u00028\u00002\u0006\u0010/\u001a\u00020\u001a2\b\b\u0002\u0010?\u001a\u00020)\u00a2\u0006\u0002\u0010@J%\u0010A\u001a\u00020\u00122\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010#\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u001aH\u0014\u00a2\u0006\u0002\u0010\'J%\u0010B\u001a\u00020\u00122\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010#\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u001aH\u0014\u00a2\u0006\u0002\u0010\'R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006C"}, d2 = {"Lcom/meals/app/base/BaseMultipleAdapter;", "T", "Ljava/io/Serializable;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "mList", "", "(Ljava/util/List;)V", "getContext", "Landroid/content/Context;", "getGetContext", "()Landroid/content/Context;", "setGetContext", "(Landroid/content/Context;)V", "getMList", "()Ljava/util/List;", "add", "", "content", "(Ljava/io/Serializable;)V", "addAll", "contents", "", "clear", "getItemCount", "", "getList", "getPageWidth", "", "getResources", "viewType", "getSize", "initAPI", "holder", "data", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/io/Serializable;)V", "initSecondAdapter", "adapterPosition", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/io/Serializable;I)V", "isEmpty", "", "lastIndex", "layoutResources", "resId", "onBindBaseViewHolder", "onBindViewHolder", "position", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "onCreateBaseViewHolder", "itemView", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "remove", "replace", "replaceAll", "setContext", "context", "setItem", "notify", "(Ljava/io/Serializable;IZ)V", "setupListener", "setupWatcher", "app_debug"})
public abstract class BaseMultipleAdapter<T extends java.io.Serializable, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    @java.lang.SuppressWarnings(value = {"unused"})
    public android.content.Context getContext;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> mList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getGetContext() {
        return null;
    }
    
    public final void setGetContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getList() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    T data, int position, boolean notify) {
    }
    
    public final void replace(@org.jetbrains.annotations.NotNull()
    T content) {
    }
    
    public final void replaceAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> contents) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    T content) {
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> contents) {
    }
    
    public final void remove(int position) {
    }
    
    public final void clear() {
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final int getSize() {
        return 0;
    }
    
    public final int lastIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract VH onCreateBaseViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView);
    
    protected abstract void onBindBaseViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, @org.jetbrains.annotations.NotNull()
    T data, int adapterPosition);
    
    protected void initAPI(@org.jetbrains.annotations.NotNull()
    VH holder, @org.jetbrains.annotations.NotNull()
    T data) {
    }
    
    protected void setupListener(@org.jetbrains.annotations.NotNull()
    VH holder, @org.jetbrains.annotations.NotNull()
    T data, int adapterPosition) {
    }
    
    protected void setupWatcher(@org.jetbrains.annotations.NotNull()
    VH holder, @org.jetbrains.annotations.NotNull()
    T data, int adapterPosition) {
    }
    
    protected void initSecondAdapter(@org.jetbrains.annotations.NotNull()
    VH holder, @org.jetbrains.annotations.NotNull()
    T data, int adapterPosition) {
    }
    
    protected int layoutResources(int resId) {
        return 0;
    }
    
    protected float getPageWidth() {
        return 0.0F;
    }
    
    private final void setContext(android.content.Context context) {
    }
    
    private final int getResources(int viewType) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<T> getMList() {
        return null;
    }
    
    public BaseMultipleAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<T> mList) {
        super();
    }
    
    public BaseMultipleAdapter() {
        super();
    }
}