package com.meals.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/meals/exception/NetworkException;", "Ljava/io/IOException;", "error", "Lcom/meals/response/ErrorResponse;", "(Lcom/meals/response/ErrorResponse;)V", "message", "", "getMessage", "()Ljava/lang/String;", "network_debug"})
public final class NetworkException extends java.io.IOException {
    private final com.meals.response.ErrorResponse error = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getMessage() {
        return null;
    }
    
    public NetworkException(@org.jetbrains.annotations.Nullable()
    com.meals.response.ErrorResponse error) {
        super();
    }
}