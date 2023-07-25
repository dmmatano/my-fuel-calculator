package com.example.myfuelcalculator.ui.fipe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00100\u001a\u00020-H\u0002J\b\u00101\u001a\u00020-H\u0002J\b\u00102\u001a\u00020-H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R,\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR,\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R,\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e\u00a8\u00063"}, d2 = {"Lcom/example/myfuelcalculator/ui/fipe/FipeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/myfuelcalculator/databinding/FragmentFipeBinding;", "binding", "getBinding", "()Lcom/example/myfuelcalculator/databinding/FragmentFipeBinding;", "fipeVehicle", "", "", "getFipeVehicle", "()Ljava/util/List;", "setFipeVehicle", "(Ljava/util/List;)V", "mainActivity", "Lcom/example/myfuelcalculator/ui/MainActivity;", "mainViewModel", "Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;", "makeList", "", "Lkotlin/Pair;", "getMakeList", "setMakeList", "modelsList", "", "getModelsList", "setModelsList", "vehicleType", "getVehicleType", "()Ljava/lang/String;", "setVehicleType", "(Ljava/lang/String;)V", "yearsList", "getYearsList", "setYearsList", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "setupButtons", "setupObservers", "setupViews", "app_debug"})
public final class FipeFragment extends androidx.fragment.app.Fragment {
    private com.example.myfuelcalculator.databinding.FragmentFipeBinding _binding;
    private com.example.myfuelcalculator.ui.viewmodel.MainViewModel mainViewModel;
    private com.example.myfuelcalculator.ui.MainActivity mainActivity;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String vehicleType = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> makeList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<kotlin.Pair<java.lang.Integer, java.lang.String>> modelsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> yearsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> fipeVehicle;
    
    public FipeFragment() {
        super();
    }
    
    private final com.example.myfuelcalculator.databinding.FragmentFipeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVehicleType() {
        return null;
    }
    
    public final void setVehicleType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getMakeList() {
        return null;
    }
    
    public final void setMakeList(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.String>> getModelsList() {
        return null;
    }
    
    public final void setModelsList(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.Integer, java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getYearsList() {
        return null;
    }
    
    public final void setYearsList(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFipeVehicle() {
        return null;
    }
    
    public final void setFipeVehicle(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers() {
    }
    
    private final void setupButtons() {
    }
    
    private final void setupViews() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}