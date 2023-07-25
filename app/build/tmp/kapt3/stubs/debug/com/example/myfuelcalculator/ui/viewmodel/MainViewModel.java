package com.example.myfuelcalculator.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0012J\u000e\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020\u0007J\u000e\u00101\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0012J\u000e\u00102\u001a\u00020-2\u0006\u00100\u001a\u00020\u0007J\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\rJ\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209J\u001e\u0010:\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010;\u001a\u0002072\u0006\u00108\u001a\u000209J\u0012\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\rJ&\u0010=\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010;\u001a\u0002072\u0006\u0010>\u001a\u0002072\u0006\u00108\u001a\u000209J.\u0010\u0019\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010;\u001a\u0002072\u0006\u0010>\u001a\u0002072\u0006\u0010?\u001a\u0002072\u0006\u00108\u001a\u000209J\u0012\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00110\rJ\u000e\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020AJ\u0006\u0010D\u001a\u000205J\u0006\u0010E\u001a\u000205J\u000e\u0010F\u001a\u0002052\u0006\u00100\u001a\u00020\u0007J\u000e\u0010G\u001a\u0002052\u0006\u0010H\u001a\u00020\tJ\u000e\u0010I\u001a\u0002052\u0006\u0010J\u001a\u00020\u000bJ\u000e\u0010K\u001a\u00020-2\u0006\u0010C\u001a\u00020AJ\u000e\u0010L\u001a\u00020-2\u0006\u00100\u001a\u00020\u0007J\u000e\u0010M\u001a\u00020\t2\u0006\u00108\u001a\u000209R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u000fR\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a\u00a8\u0006N"}, d2 = {"Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/myfuelcalculator/repository/AppRepository;", "(Lcom/example/myfuelcalculator/repository/AppRepository;)V", "_bsVehicle", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/myfuelcalculator/model/Vehicle;", "_permissionGranted", "", "_vehicleImage", "Landroid/graphics/Bitmap;", "bsVehicle", "Landroidx/lifecycle/LiveData;", "getBsVehicle", "()Landroidx/lifecycle/LiveData;", "currentCostList", "", "Lcom/example/myfuelcalculator/model/FuelCost;", "getCurrentCostList", "()Ljava/util/List;", "setCurrentCostList", "(Ljava/util/List;)V", "fipeVehicle", "Lcom/example/myfuelcalculator/model/FipeVehicle;", "getFipeVehicle", "()Landroidx/lifecycle/MutableLiveData;", "fragmentsAlreadyShown", "", "getFragmentsAlreadyShown", "setFragmentsAlreadyShown", "makeList", "Lcom/example/myfuelcalculator/model/Make;", "getMakeList", "modelsList", "Lcom/example/myfuelcalculator/model/Models;", "getModelsList", "permissionGranted", "getPermissionGranted", "vehicleImage", "getVehicleImage", "yearsList", "Lcom/example/myfuelcalculator/model/Year;", "getYearsList", "addCost", "Lkotlinx/coroutines/Job;", "cost", "addVehicle", "v", "deleteCost", "deleteVehicle", "getAllCosts", "getAllMakes", "", "veiculo", "", "context", "Landroid/content/Context;", "getAllModels", "codMarca", "getAllVehicles", "getAllYears", "codModelo", "codAno", "getUser", "Lcom/example/myfuelcalculator/model/User;", "insertUser", "user", "populateCostDb", "populateVehicleDb", "setBsVehicle", "setPermissionGranted", "permission", "setVehicleImage", "b", "updateUser", "updateVehicle", "verificarConexaoInternet", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myfuelcalculator.repository.AppRepository repository = null;
    private androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> _vehicleImage;
    private androidx.lifecycle.MutableLiveData<com.example.myfuelcalculator.model.Vehicle> _bsVehicle;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _permissionGranted;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.myfuelcalculator.model.FuelCost> currentCostList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Boolean> fragmentsAlreadyShown;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.myfuelcalculator.model.Make>> makeList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.myfuelcalculator.model.Models> modelsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.myfuelcalculator.model.Year>> yearsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.myfuelcalculator.model.FipeVehicle> fipeVehicle = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.repository.AppRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.graphics.Bitmap> getVehicleImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.myfuelcalculator.model.Vehicle> getBsVehicle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getPermissionGranted() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.myfuelcalculator.model.FuelCost> getCurrentCostList() {
        return null;
    }
    
    public final void setCurrentCostList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.myfuelcalculator.model.FuelCost> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Boolean> getFragmentsAlreadyShown() {
        return null;
    }
    
    public final void setFragmentsAlreadyShown(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.myfuelcalculator.model.Make>> getMakeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.myfuelcalculator.model.Models> getModelsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.myfuelcalculator.model.Year>> getYearsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.myfuelcalculator.model.FipeVehicle> getFipeVehicle() {
        return null;
    }
    
    public final void setPermissionGranted(boolean permission) {
    }
    
    public final void setBsVehicle(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.Vehicle v) {
    }
    
    public final void setVehicleImage(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap b) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertUser(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateUser(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfuelcalculator.model.User>> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addVehicle(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.Vehicle v) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateVehicle(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.Vehicle v) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteVehicle(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.Vehicle v) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfuelcalculator.model.Vehicle>> getAllVehicles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addCost(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.FuelCost cost) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteCost(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.FuelCost cost) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myfuelcalculator.model.FuelCost>> getAllCosts() {
        return null;
    }
    
    public final void getAllMakes(@org.jetbrains.annotations.NotNull()
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void getAllModels(@org.jetbrains.annotations.NotNull()
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    java.lang.String codMarca, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void getAllYears(@org.jetbrains.annotations.NotNull()
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    java.lang.String codMarca, @org.jetbrains.annotations.NotNull()
    java.lang.String codModelo, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void getFipeVehicle(@org.jetbrains.annotations.NotNull()
    java.lang.String veiculo, @org.jetbrains.annotations.NotNull()
    java.lang.String codMarca, @org.jetbrains.annotations.NotNull()
    java.lang.String codModelo, @org.jetbrains.annotations.NotNull()
    java.lang.String codAno, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean verificarConexaoInternet(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void populateVehicleDb() {
    }
    
    public final void populateCostDb() {
    }
}