package com.example.myfuelcalculator.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@androidx.room.Entity(tableName = "costs")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013\u00a8\u00061"}, d2 = {"Lcom/example/myfuelcalculator/model/FuelCost;", "Landroid/os/Parcelable;", "cid", "", "name", "", "totalCost", "", "vehicle", "fuel", "totalDistance", "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;D)V", "getCid", "()I", "setCid", "(I)V", "getFuel", "()Ljava/lang/String;", "setFuel", "(Ljava/lang/String;)V", "getName", "setName", "getTotalCost", "()D", "setTotalCost", "(D)V", "getTotalDistance", "setTotalDistance", "getVehicle", "setVehicle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class FuelCost implements android.os.Parcelable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int cid;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @androidx.room.ColumnInfo(name = "total_cost")
    private double totalCost;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "vehicle")
    private java.lang.String vehicle;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "fuel")
    private java.lang.String fuel;
    @androidx.room.ColumnInfo(name = "total_distance")
    private double totalDistance;
    public static final android.os.Parcelable.Creator<com.example.myfuelcalculator.model.FuelCost> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfuelcalculator.model.FuelCost copy(int cid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double totalCost, @org.jetbrains.annotations.NotNull()
    java.lang.String vehicle, @org.jetbrains.annotations.NotNull()
    java.lang.String fuel, double totalDistance) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FuelCost(int cid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double totalCost, @org.jetbrains.annotations.NotNull()
    java.lang.String vehicle, @org.jetbrains.annotations.NotNull()
    java.lang.String fuel, double totalDistance) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCid() {
        return 0;
    }
    
    public final void setCid(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getTotalCost() {
        return 0.0;
    }
    
    public final void setTotalCost(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVehicle() {
        return null;
    }
    
    public final void setVehicle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFuel() {
        return null;
    }
    
    public final void setFuel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getTotalDistance() {
        return 0.0;
    }
    
    public final void setTotalDistance(double p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.myfuelcalculator.model.FuelCost> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.myfuelcalculator.model.FuelCost createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.myfuelcalculator.model.FuelCost[] newArray(int size) {
            return null;
        }
    }
}