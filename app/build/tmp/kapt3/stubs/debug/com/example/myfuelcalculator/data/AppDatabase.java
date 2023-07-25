package com.example.myfuelcalculator.data;

import java.lang.System;

@androidx.room.Database(entities = {com.example.myfuelcalculator.model.FuelCost.class, com.example.myfuelcalculator.model.Vehicle.class, com.example.myfuelcalculator.model.User.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/example/myfuelcalculator/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getFuelCostDao", "Lcom/example/myfuelcalculator/data/dao/FuelCostDao;", "getUserDao", "Lcom/example/myfuelcalculator/data/dao/UserDao;", "getVehicleDao", "Lcom/example/myfuelcalculator/data/dao/VehicleDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myfuelcalculator.data.AppDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.example.myfuelcalculator.data.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.myfuelcalculator.data.dao.FuelCostDao getFuelCostDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.myfuelcalculator.data.dao.VehicleDao getVehicleDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.myfuelcalculator.data.dao.UserDao getUserDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/myfuelcalculator/data/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/myfuelcalculator/data/AppDatabase;", "buildDatabase", "ctxt", "Landroid/content/Context;", "getInstance", "context", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfuelcalculator.data.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.example.myfuelcalculator.data.AppDatabase buildDatabase(android.content.Context ctxt) {
            return null;
        }
    }
}