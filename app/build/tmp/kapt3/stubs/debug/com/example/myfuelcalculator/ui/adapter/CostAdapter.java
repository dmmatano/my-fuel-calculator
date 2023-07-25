package com.example.myfuelcalculator.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0013H\u0002J \u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/myfuelcalculator/ui/adapter/CostAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myfuelcalculator/ui/adapter/CostAdapter$CostViewHolder;", "mainViewModel", "Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;", "context", "Landroid/content/Context;", "(Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/myfuelcalculator/model/FuelCost;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "roundToDecimalPlaces", "", "number", "", "places", "setupDeleteAlertDialog", "view", "Landroid/view/View;", "currentCost", "CostViewHolder", "app_debug"})
public final class CostAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myfuelcalculator.ui.adapter.CostAdapter.CostViewHolder> {
    private final com.example.myfuelcalculator.ui.viewmodel.MainViewModel mainViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.myfuelcalculator.model.FuelCost> differCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.myfuelcalculator.model.FuelCost> differ = null;
    
    public CostAdapter(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.ui.viewmodel.MainViewModel mainViewModel, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.example.myfuelcalculator.model.FuelCost> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myfuelcalculator.ui.adapter.CostAdapter.CostViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.ui.adapter.CostAdapter.CostViewHolder holder, int position) {
    }
    
    private final java.lang.String roundToDecimalPlaces(double number, int places) {
        return null;
    }
    
    private final void removeItem(int position) {
    }
    
    private final void setupDeleteAlertDialog(android.view.View view, com.example.myfuelcalculator.model.FuelCost currentCost, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myfuelcalculator/ui/adapter/CostAdapter$CostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/example/myfuelcalculator/databinding/FuelCostItemBinding;", "(Lcom/example/myfuelcalculator/databinding/FuelCostItemBinding;)V", "getItemBinding", "()Lcom/example/myfuelcalculator/databinding/FuelCostItemBinding;", "app_debug"})
    public static final class CostViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.myfuelcalculator.databinding.FuelCostItemBinding itemBinding = null;
        
        public CostViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.myfuelcalculator.databinding.FuelCostItemBinding itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfuelcalculator.databinding.FuelCostItemBinding getItemBinding() {
            return null;
        }
    }
}