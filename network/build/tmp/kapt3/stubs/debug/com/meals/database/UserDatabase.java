package com.meals.database;

import java.lang.System;

@androidx.room.Database(entities = {com.meals.entity.HeaderEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/meals/database/UserDatabase;", "Landroidx/room/RoomDatabase;", "()V", "mainDao", "Lcom/meals/dao/HeaderDao;", "Companion", "network_debug"})
public abstract class UserDatabase extends androidx.room.RoomDatabase {
    private static com.meals.database.UserDatabase INSTANCE;
    private static final java.lang.Object lock = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.meals.database.UserDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.meals.dao.HeaderDao mainDao();
    
    public UserDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/meals/database/UserDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/meals/database/UserDatabase;", "lock", "getInstance", "context", "Landroid/content/Context;", "network_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.meals.database.UserDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}