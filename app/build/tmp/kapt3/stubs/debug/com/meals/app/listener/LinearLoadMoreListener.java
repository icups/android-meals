package com.meals.app.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/meals/app/listener/LinearLoadMoreListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "isLoading", "", "loadMoreItems", "", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_debug"})
public abstract class LinearLoadMoreListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private final androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = null;
    
    public abstract boolean isLoading();
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    public abstract void loadMoreItems();
    
    public LinearLoadMoreListener(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        super();
    }
}