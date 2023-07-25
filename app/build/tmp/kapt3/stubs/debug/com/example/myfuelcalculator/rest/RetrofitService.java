package com.example.myfuelcalculator.rest;

import java.lang.System;

/**
 * FIPE API HTTP REST
 * https://deividfortuna.github.io/fipe/
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0007H\'J2\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0007H\'J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/example/myfuelcalculator/rest/RetrofitService;", "", "getAllMakes", "Lretrofit2/Call;", "", "Lcom/example/myfuelcalculator/model/Make;", "veiculo", "", "getAllModels", "Lcom/example/myfuelcalculator/model/Models;", "codMarca", "getAllYears", "Lcom/example/myfuelcalculator/model/Year;", "codModelo", "getFipeVehicle", "Lcom/example/myfuelcalculator/model/FipeVehicle;", "codAno", "Companion", "app_debug"})
public abstract interface RetrofitService {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myfuelcalculator.rest.RetrofitService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{veiculo}/marcas")
    public abstract retrofit2.Call<java.util.List<com.example.myfuelcalculator.model.Make>> getAllMakes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "veiculo")
    java.lang.String veiculo);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{veiculo}/marcas/{codmarca}/modelos")
    public abstract retrofit2.Call<com.example.myfuelcalculator.model.Models> getAllModels(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "veiculo")
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "codmarca")
    java.lang.String codMarca);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{veiculo}/marcas/{codmarca}/modelos/{codmodelo}/anos")
    public abstract retrofit2.Call<java.util.List<com.example.myfuelcalculator.model.Year>> getAllYears(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "veiculo")
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "codmarca")
    java.lang.String codMarca, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "codmodelo")
    java.lang.String codModelo);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{veiculo}/marcas/{codmarca}/modelos/{codmodelo}/anos/{codano}")
    public abstract retrofit2.Call<com.example.myfuelcalculator.model.FipeVehicle> getFipeVehicle(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "veiculo")
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "codmarca")
    java.lang.String codMarca, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "codmodelo")
    java.lang.String codModelo, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "codano")
    java.lang.String codAno);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/myfuelcalculator/rest/RetrofitService$Companion;", "", "()V", "retrofitService", "Lcom/example/myfuelcalculator/rest/RetrofitService;", "getRetrofitService", "()Lcom/example/myfuelcalculator/rest/RetrofitService;", "retrofitService$delegate", "Lkotlin/Lazy;", "getInstance", "app_debug"})
    public static final class Companion {
        private static final kotlin.Lazy retrofitService$delegate = null;
        
        private Companion() {
            super();
        }
        
        private final com.example.myfuelcalculator.rest.RetrofitService getRetrofitService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfuelcalculator.rest.RetrofitService getInstance() {
            return null;
        }
    }
}