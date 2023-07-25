package com.example.myfuelcalculator.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/myfuelcalculator/ui/adapter/VehicleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myfuelcalculator/ui/adapter/VehicleAdapter$VehicleViewHolder;", "activity", "Lcom/example/myfuelcalculator/ui/MainActivity;", "(Lcom/example/myfuelcalculator/ui/MainActivity;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/example/myfuelcalculator/model/Vehicle;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "autonomyToString", "", "autonomy", "", "getItemCount", "", "loadUriImage", "Landroid/graphics/Bitmap;", "uriString", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "VehicleViewHolder", "app_debug"})
public final class VehicleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myfuelcalculator.ui.adapter.VehicleAdapter.VehicleViewHolder> {
    private final com.example.myfuelcalculator.ui.MainActivity activity = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.myfuelcalculator.model.Vehicle> differCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.example.myfuelcalculator.model.Vehicle> differ = null;
    
    public VehicleAdapter(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.ui.MainActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.example.myfuelcalculator.model.Vehicle> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myfuelcalculator.ui.adapter.VehicleAdapter.VehicleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.ui.adapter.VehicleAdapter.VehicleViewHolder holder, int position) {
    }
    
    private final android.graphics.Bitmap loadUriImage(java.lang.String uriString) {
        return null;
    }
    
    private final java.lang.CharSequence autonomyToString(double autonomy) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myfuelcalculator/ui/adapter/VehicleAdapter$VehicleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/example/myfuelcalculator/databinding/VehicleItemBinding;", "(Lcom/example/myfuelcalculator/databinding/VehicleItemBinding;)V", "getItemBinding", "()Lcom/example/myfuelcalculator/databinding/VehicleItemBinding;", "app_debug"})
    public static final class VehicleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.myfuelcalculator.databinding.VehicleItemBinding itemBinding = null;
        
        public VehicleViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.myfuelcalculator.databinding.VehicleItemBinding itemBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myfuelcalculator.databinding.VehicleItemBinding getItemBinding() {
            return null;
        }
    }
}