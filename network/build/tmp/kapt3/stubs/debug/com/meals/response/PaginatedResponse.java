package com.meals.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/meals/response/PaginatedResponse;", "T", "Ljava/io/Serializable;", "totalCount", "", "result", "", "message", "", "(ILjava/util/List;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getResult", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "network_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class PaginatedResponse<T extends java.lang.Object> implements java.io.Serializable {
    private final int totalCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> result = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    
    public final int getTotalCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public PaginatedResponse(@com.squareup.moshi.Json(name = "total_count")
    int totalCount, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "meals")
    java.util.List<? extends T> result, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        super();
    }
    
    public PaginatedResponse() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.meals.response.PaginatedResponse<T> copy(@com.squareup.moshi.Json(name = "total_count")
    int totalCount, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "meals")
    java.util.List<? extends T> result, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}