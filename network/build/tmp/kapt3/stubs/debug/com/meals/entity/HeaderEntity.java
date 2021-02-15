package com.meals.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "header")
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\t\u001a\u00020\u0005\u0012\b\b\u0003\u0010\n\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\f\u001a\u00020\u0005\u0012\b\b\u0003\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000eJ\t\u0010(\u001a\u00020)H\u00d6\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020)H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012\u00a8\u0006/"}, d2 = {"Lcom/meals/entity/HeaderEntity;", "Landroid/os/Parcelable;", "id", "", "contentType", "", "deviceId", "deviceName", "version", "timeZone", "operatingSystem", "long", "lat", "fireBase", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getDeviceId", "setDeviceId", "getDeviceName", "setDeviceName", "getFireBase", "setFireBase", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLat", "setLat", "getLong", "setLong", "getOperatingSystem", "setOperatingSystem", "getTimeZone", "setTimeZone", "getVersion", "setVersion", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "network_debug"})
public final class HeaderEntity implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String contentType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String deviceId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String deviceName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String version;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String timeZone;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String operatingSystem;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lat;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fireBase;
    public static final android.os.Parcelable.Creator<com.meals.entity.HeaderEntity> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContentType() {
        return null;
    }
    
    public final void setContentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceId() {
        return null;
    }
    
    public final void setDeviceId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceName() {
        return null;
    }
    
    public final void setDeviceName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public final void setVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeZone() {
        return null;
    }
    
    public final void setTimeZone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOperatingSystem() {
        return null;
    }
    
    public final void setOperatingSystem(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLong() {
        return null;
    }
    
    public final void setLong(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLat() {
        return null;
    }
    
    public final void setLat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFireBase() {
        return null;
    }
    
    public final void setFireBase(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public HeaderEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "DeviceId")
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "DeviceName")
    java.lang.String deviceName, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Version")
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "TimeZone")
    java.lang.String timeZone, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Os")
    java.lang.String operatingSystem, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Long")
    java.lang.String p7_1663806, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "Firebase")
    java.lang.String fireBase) {
        super();
    }
    
    public HeaderEntity() {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.meals.entity.HeaderEntity> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.meals.entity.HeaderEntity[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.meals.entity.HeaderEntity createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}