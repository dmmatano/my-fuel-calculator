package com.example.myfuelcalculator.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#J\u0012\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\u001eH\u0014J-\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0,2\u0006\u0010-\u001a\u00020.H\u0016\u00a2\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020\u001eJ\b\u00101\u001a\u00020\u001eH\u0002J\u0016\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206J\b\u00107\u001a\u00020\u001eH\u0002J\b\u00108\u001a\u00020\u001eH\u0002J\u0016\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020#R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006<"}, d2 = {"Lcom/example/myfuelcalculator/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_binding", "Lcom/example/myfuelcalculator/databinding/ActivityMainBinding;", "binding", "getBinding", "()Lcom/example/myfuelcalculator/databinding/ActivityMainBinding;", "imagePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "mainViewModel", "Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;", "setMainViewModel", "(Lcom/example/myfuelcalculator/ui/viewmodel/MainViewModel;)V", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "selectedImageUri", "Landroid/net/Uri;", "getSelectedImageUri", "()Landroid/net/Uri;", "setSelectedImageUri", "(Landroid/net/Uri;)V", "abrirGoogleMaps", "", "imagePickerResult", "loadUriImage", "Landroid/graphics/Bitmap;", "uriString", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openImageGallery", "requestWritePermission", "saveOrUpdateVehicle", "vehicle", "Lcom/example/myfuelcalculator/model/Vehicle;", "isVehicleNew", "", "setupBottomNavigation", "setupViewModel", "showSuccessFeedbackSnackbar", "success", "msg", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.myfuelcalculator.databinding.ActivityMainBinding _binding;
    public com.example.myfuelcalculator.ui.viewmodel.MainViewModel mainViewModel;
    public androidx.navigation.NavController navController;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri selectedImageUri;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> imagePickerLauncher;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfuelcalculator.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myfuelcalculator.ui.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.ui.viewmodel.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getSelectedImageUri() {
        return null;
    }
    
    public final void setSelectedImageUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void imagePickerResult() {
    }
    
    private final void requestWritePermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void setupViewModel() {
    }
    
    private final void setupBottomNavigation() {
    }
    
    public final void showSuccessFeedbackSnackbar(boolean success, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void openImageGallery() {
    }
    
    public final void saveOrUpdateVehicle(@org.jetbrains.annotations.NotNull()
    com.example.myfuelcalculator.model.Vehicle vehicle, boolean isVehicleNew) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap loadUriImage(@org.jetbrains.annotations.Nullable()
    java.lang.String uriString) {
        return null;
    }
    
    public final void abrirGoogleMaps() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}