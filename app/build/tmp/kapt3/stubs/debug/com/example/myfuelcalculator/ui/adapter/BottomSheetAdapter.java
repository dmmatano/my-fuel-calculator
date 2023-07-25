package com.example.myfuelcalculator.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/myfuelcalculator/ui/adapter/BottomSheetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myfuelcalculator/ui/adapter/BottomSheetAdapter$BottomSheetViewHolder;", "viewModel", "Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "(Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/myfuelcalculator/model/Vehicle;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BottomSheetViewHolder", "app_debug"})
public final class BottomSheetAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myfuelcalculator.ui.adapter.BottomSheetAdapter.BottomSheetViewHolder> {
    private final com.example.myfuelcalculator.ui.viewmodel.MainViewModel viewModel = null;
    private final com.google.android.material.bottomsheet.BottomSheetDialog dialog = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.myfuelcalculator.model.Vehicle> differCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.myfuelcalculator.model.Vehicle> differ = null;
    
    public BottomSheetAdapter(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.ui.viewmodel.MainViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetDialog dialog) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.example.myfuelcalculator.model.Vehicle> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myfuelcalculator.ui.adapter.BottomSheetAdapter.BottomSheetViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.ui.adapter.BottomSheetAdapter.BottomSheetViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myfuelcalculator/ui/adapter/BottomSheetAdapter$BottomSheetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/example/myfuelcalculator/databinding/ItemVehicleBottomSheetBinding;", "(Lcom/example/myfuelcalculator/databinding/ItemVehicleBottomSheetBinding;)V", "getItemBinding", "()Lcom/example/myfuelcalculator/databinding/ItemVehicleBottomSheetBinding;", "app_debug"})
    public static final class BottomSheetViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.myfuelcalculator.databinding.ItemVehicleBottomSheetBinding itemBinding = null;
        
        public BottomSheetViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.myfuelcalculator.databinding.ItemVehicleBottomSheetBinding itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfuelcalculator.databinding.ItemVehicleBottomSheetBinding getItemBinding() {
            return null;
        }
    }
}