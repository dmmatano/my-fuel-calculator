package com.example.myfuelcalculator.ui.calculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J$\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\u0017H\u0002J\b\u0010*\u001a\u00020\u0017H\u0002J\b\u0010+\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/myfuelcalculator/ui/calculator/CalculatorFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/myfuelcalculator/databinding/FragmentCalculatorBinding;", "binding", "getBinding", "()Lcom/example/myfuelcalculator/databinding/FragmentCalculatorBinding;", "bottomSheetAdapter", "Lcom/example/myfuelcalculator/ui/adapter/BottomSheetAdapter;", "bottomSheetRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "firstObserver", "", "mainActivity", "Lcom/example/myfuelcalculator/ui/MainActivity;", "mainViewModel", "Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;", "vehicle", "Lcom/example/myfuelcalculator/model/Vehicle;", "calculateCost", "", "view", "Landroid/view/View;", "inputsAccepted", "name", "", "authonomy", "", "literCost", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "setupButtons", "setupViews", "showBottomSheet", "app_debug"})
public final class CalculatorFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView bottomSheetRecyclerView;
    private com.example.myfuelcalculator.databinding.FragmentCalculatorBinding _binding;
    private com.example.myfuelcalculator.ui.adapter.BottomSheetAdapter bottomSheetAdapter;
    private com.example.myfuelcalculator.ui.viewmodel.MainViewModel mainViewModel;
    private com.example.myfuelcalculator.ui.MainActivity mainActivity;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    private com.example.myfuelcalculator.model.Vehicle vehicle;
    private boolean firstObserver = true;
    
    public CalculatorFragment() {
        super();
    }
    
    private final com.example.myfuelcalculator.databinding.FragmentCalculatorBinding getBinding() {
        return null;
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
    
    private final void setupViews() {
    }
    
    private final void setupButtons() {
    }
    
    private final void calculateCost(android.view.View view) {
    }
    
    private final boolean inputsAccepted(java.lang.String name, double authonomy, double literCost) {
        return false;
    }
    
    private final void showBottomSheet() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}