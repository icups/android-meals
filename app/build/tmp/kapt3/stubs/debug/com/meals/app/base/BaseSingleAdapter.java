package com.meals.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 J*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004:\u0001JB\u0015\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001b\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fJ\b\u0010 \u001a\u00020\u0010H\u0014J\b\u0010!\u001a\u00020\"H\u0014J\u0006\u0010#\u001a\u00020\u0018J\r\u0010$\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010%J\u0017\u0010&\u001a\u00028\u00002\b\b\u0002\u0010\'\u001a\u00020\u0010H\u0002\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00028\u0000\u00a2\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u0010H\u0016J\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\b\u0010.\u001a\u00020/H\u0014J\b\u00100\u001a\u00020/H\u0014J\u0006\u00101\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\"J\u0006\u00103\u001a\u00020\"J\u0006\u00104\u001a\u00020\u0010J\r\u00105\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010%J\b\u00106\u001a\u00020\u0010H$J%\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00028\u00012\u0006\u00109\u001a\u00028\u00002\u0006\u0010:\u001a\u00020\u0010H$\u00a2\u0006\u0002\u0010;J\u001e\u0010<\u001a\u00020\u00182\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\'\u001a\u00020\u0010H\u0016J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0010H\u0016J\u000e\u0010B\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u0010J\u0014\u0010C\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fJ\u0010\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020\nH\u0002J\'\u0010F\u001a\u00020\u00182\u0006\u00108\u001a\u00028\u00012\u0006\u0010:\u001a\u00020\u00102\b\b\u0001\u0010G\u001a\u00020\u0010H\u0002\u00a2\u0006\u0002\u0010HJ\u001b\u0010I\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006K"}, d2 = {"Lcom/meals/app/base/BaseSingleAdapter;", "T", "VDB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/meals/app/base/BaseViewHolder;", "mList", "", "(Ljava/util/List;)V", "adapterContext", "Landroid/content/Context;", "getAdapterContext", "()Landroid/content/Context;", "setAdapterContext", "(Landroid/content/Context;)V", "lastAnimatedPosition", "", "getLastAnimatedPosition", "()I", "setLastAnimatedPosition", "(I)V", "getMList", "()Ljava/util/List;", "add", "", "content", "(Ljava/lang/Object;)V", "index", "(ILjava/lang/Object;)V", "addAll", "contents", "", "animResources", "animated", "", "clear", "firstItem", "()Ljava/lang/Object;", "getData", "position", "(I)Ljava/lang/Object;", "getIndexOf", "item", "(Ljava/lang/Object;)I", "getItemCount", "getList", "getPageHeight", "", "getPageWidth", "getSize", "isEmpty", "isNotEmpty", "lastIndex", "lastItem", "layoutResources", "onBindBaseViewHolder", "binding", "data", "adapterPosition", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;I)V", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "remove", "replaceAll", "setContext", "context", "setupAnimation", "resId", "(Landroidx/databinding/ViewDataBinding;II)V", "update", "Companion", "app_debug"})
public abstract class BaseSingleAdapter<T extends java.lang.Object, VDB extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.meals.app.base.BaseViewHolder<VDB>> {
    @java.lang.SuppressWarnings(value = {"unused"})
    public android.content.Context adapterContext;
    private int lastAnimatedPosition = -1;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> mList = null;
    public static final int firstIndex = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.meals.app.base.BaseSingleAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getAdapterContext() {
        return null;
    }
    
    public final void setAdapterContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final int getLastAnimatedPosition() {
        return 0;
    }
    
    public final void setLastAnimatedPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.meals.app.base.BaseViewHolder<VDB> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.meals.app.base.BaseViewHolder<VDB> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void replaceAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> contents) {
    }
    
    public final void add(T content) {
    }
    
    public final void add(int index, T content) {
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> contents) {
    }
    
    public final void update(int position, T content) {
    }
    
    public final void remove(int position) {
    }
    
    public final void clear() {
    }
    
    public final int getIndexOf(T item) {
        return 0;
    }
    
    private final T getData(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T firstItem() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T lastItem() {
        return null;
    }
    
    public final int lastIndex() {
        return 0;
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final boolean isNotEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getList() {
        return null;
    }
    
    public final int getSize() {
        return 0;
    }
    
    private final void setContext(android.content.Context context) {
    }
    
    protected float getPageWidth() {
        return 0.0F;
    }
    
    protected float getPageHeight() {
        return 0.0F;
    }
    
    protected abstract void onBindBaseViewHolder(@org.jetbrains.annotations.NotNull()
    VDB binding, T data, int adapterPosition);
    
    private final void setupAnimation(VDB binding, int adapterPosition, @androidx.annotation.AnimRes()
    int resId) {
    }
    
    protected int animResources() {
        return 0;
    }
    
    protected boolean animated() {
        return false;
    }
    
    protected abstract int layoutResources();
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<T> getMList() {
        return null;
    }
    
    public BaseSingleAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<T> mList) {
        super();
    }
    
    public BaseSingleAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/meals/app/base/BaseSingleAdapter$Companion;", "", "()V", "firstIndex", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}