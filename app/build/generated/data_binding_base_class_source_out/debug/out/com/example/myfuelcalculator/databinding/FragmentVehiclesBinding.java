// Generated by view binder compiler. Do not edit!
package com.example.myfuelcalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myfuelcalculator.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentVehiclesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnDeleteVehicle;

  @NonNull
  public final ImageButton btnEditImage;

  @NonNull
  public final MaterialButton btnUpdateVehicle;

  @NonNull
  public final TextInputEditText edtAutonomy;

  @NonNull
  public final TextInputLayout edtAutonomyLayout;

  @NonNull
  public final TextInputEditText edtFuel;

  @NonNull
  public final TextInputLayout edtFuelLayout;

  @NonNull
  public final TextInputEditText edtNome;

  @NonNull
  public final TextInputLayout edtNomeLayout;

  @NonNull
  public final ImageView vehicleImageView;

  @NonNull
  public final TextView vehiclesTitleTextView;

  private FragmentVehiclesBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnDeleteVehicle, @NonNull ImageButton btnEditImage,
      @NonNull MaterialButton btnUpdateVehicle, @NonNull TextInputEditText edtAutonomy,
      @NonNull TextInputLayout edtAutonomyLayout, @NonNull TextInputEditText edtFuel,
      @NonNull TextInputLayout edtFuelLayout, @NonNull TextInputEditText edtNome,
      @NonNull TextInputLayout edtNomeLayout, @NonNull ImageView vehicleImageView,
      @NonNull TextView vehiclesTitleTextView) {
    this.rootView = rootView;
    this.btnDeleteVehicle = btnDeleteVehicle;
    this.btnEditImage = btnEditImage;
    this.btnUpdateVehicle = btnUpdateVehicle;
    this.edtAutonomy = edtAutonomy;
    this.edtAutonomyLayout = edtAutonomyLayout;
    this.edtFuel = edtFuel;
    this.edtFuelLayout = edtFuelLayout;
    this.edtNome = edtNome;
    this.edtNomeLayout = edtNomeLayout;
    this.vehicleImageView = vehicleImageView;
    this.vehiclesTitleTextView = vehiclesTitleTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVehiclesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVehiclesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_vehicles, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVehiclesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDeleteVehicle;
      MaterialButton btnDeleteVehicle = ViewBindings.findChildViewById(rootView, id);
      if (btnDeleteVehicle == null) {
        break missingId;
      }

      id = R.id.btnEditImage;
      ImageButton btnEditImage = ViewBindings.findChildViewById(rootView, id);
      if (btnEditImage == null) {
        break missingId;
      }

      id = R.id.btnUpdateVehicle;
      MaterialButton btnUpdateVehicle = ViewBindings.findChildViewById(rootView, id);
      if (btnUpdateVehicle == null) {
        break missingId;
      }

      id = R.id.edtAutonomy;
      TextInputEditText edtAutonomy = ViewBindings.findChildViewById(rootView, id);
      if (edtAutonomy == null) {
        break missingId;
      }

      id = R.id.edtAutonomyLayout;
      TextInputLayout edtAutonomyLayout = ViewBindings.findChildViewById(rootView, id);
      if (edtAutonomyLayout == null) {
        break missingId;
      }

      id = R.id.edtFuel;
      TextInputEditText edtFuel = ViewBindings.findChildViewById(rootView, id);
      if (edtFuel == null) {
        break missingId;
      }

      id = R.id.edtFuelLayout;
      TextInputLayout edtFuelLayout = ViewBindings.findChildViewById(rootView, id);
      if (edtFuelLayout == null) {
        break missingId;
      }

      id = R.id.edtNome;
      TextInputEditText edtNome = ViewBindings.findChildViewById(rootView, id);
      if (edtNome == null) {
        break missingId;
      }

      id = R.id.edtNomeLayout;
      TextInputLayout edtNomeLayout = ViewBindings.findChildViewById(rootView, id);
      if (edtNomeLayout == null) {
        break missingId;
      }

      id = R.id.vehicleImageView;
      ImageView vehicleImageView = ViewBindings.findChildViewById(rootView, id);
      if (vehicleImageView == null) {
        break missingId;
      }

      id = R.id.vehiclesTitleTextView;
      TextView vehiclesTitleTextView = ViewBindings.findChildViewById(rootView, id);
      if (vehiclesTitleTextView == null) {
        break missingId;
      }

      return new FragmentVehiclesBinding((ConstraintLayout) rootView, btnDeleteVehicle,
          btnEditImage, btnUpdateVehicle, edtAutonomy, edtAutonomyLayout, edtFuel, edtFuelLayout,
          edtNome, edtNomeLayout, vehicleImageView, vehiclesTitleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
