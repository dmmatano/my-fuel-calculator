package com.example.myfuelcalculator.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u0011J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017J\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\u0011J*\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00120\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00120\u0011J\u0019\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010*\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/example/myfuelcalculator/repository/AppRepository;", "", "database", "Lcom/example/myfuelcalculator/data/AppDatabase;", "retrofitService", "Lcom/example/myfuelcalculator/rest/RetrofitService;", "(Lcom/example/myfuelcalculator/data/AppDatabase;Lcom/example/myfuelcalculator/rest/RetrofitService;)V", "deleteCost", "", "cost", "Lcom/example/myfuelcalculator/model/FuelCost;", "(Lcom/example/myfuelcalculator/model/FuelCost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteVehicle", "vehicle", "Lcom/example/myfuelcalculator/model/Vehicle;", "(Lcom/example/myfuelcalculator/model/Vehicle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCosts", "Landroidx/lifecycle/LiveData;", "", "getAllMakes", "Lretrofit2/Call;", "Lcom/example/myfuelcalculator/model/Make;", "veiculo", "", "getAllModels", "Lcom/example/myfuelcalculator/model/Models;", "codMarca", "getAllVehicles", "getAllYears", "Lcom/example/myfuelcalculator/model/Year;", "codModelo", "getFipeVehicle", "Lcom/example/myfuelcalculator/model/FipeVehicle;", "codAno", "getUser", "Lcom/example/myfuelcalculator/model/User;", "insertCost", "insertUser", "user", "(Lcom/example/myfuelcalculator/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertVehicle", "updateUser", "updateVehicle", "app_debug"})
public final class AppRepository {
    private final com.example.myfuelcalculator.data.AppDatabase database = null;
    private final com.example.myfuelcalculator.rest.RetrofitService retrofitService = null;
    
    public AppRepository(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.data.AppDatabase database, @org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.rest.RetrofitService retrofitService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertVehicle(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.Vehicle vehicle, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteVehicle(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.Vehicle vehicle, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateVehicle(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.Vehicle vehicle, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfuelcalculator.model.Vehicle>> getAllVehicles() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertCost(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.FuelCost cost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCost(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.FuelCost cost, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfuelcalculator.model.FuelCost>> getAllCosts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertUser(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfuelcalculator.model.User>> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.example.myfuelcalculator.model.Make>> getAllMakes(@org.jetbrains.annotations.NotNull()
    java.lang.String veiculo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.example.myfuelcalculator.model.Models> getAllModels(@org.jetbrains.annotations.NotNull()
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    java.lang.String codMarca) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.example.myfuelcalculator.model.Year>> getAllYears(@org.jetbrains.annotations.NotNull()
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    java.lang.String codMarca, @org.jetbrains.annotations.NotNull()
    java.lang.String codModelo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.example.myfuelcalculator.model.FipeVehicle> getFipeVehicle(@org.jetbrains.annotations.NotNull()
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    java.lang.String codMarca, @org.jetbrains.annotations.NotNull()
    java.lang.String codModelo, @org.jetbrains.annotations.NotNull()
    java.lang.String codAno) {
        return null;
    }
}