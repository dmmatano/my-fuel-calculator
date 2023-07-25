package com.example.myfuelcalculator.ui.vehicles

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.myfuelcalculator.model.Vehicle
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class VehiclesFragmentArgs(
  public val vehicle: Vehicle? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Vehicle::class.java)) {
      result.putParcelable("vehicle", this.vehicle as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Vehicle::class.java)) {
      result.putSerializable("vehicle", this.vehicle as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Vehicle::class.java)) {
      result.set("vehicle", this.vehicle as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Vehicle::class.java)) {
      result.set("vehicle", this.vehicle as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): VehiclesFragmentArgs {
      bundle.setClassLoader(VehiclesFragmentArgs::class.java.classLoader)
      val __vehicle : Vehicle?
      if (bundle.containsKey("vehicle")) {
        if (Parcelable::class.java.isAssignableFrom(Vehicle::class.java) ||
            Serializable::class.java.isAssignableFrom(Vehicle::class.java)) {
          __vehicle = bundle.get("vehicle") as Vehicle?
        } else {
          throw UnsupportedOperationException(Vehicle::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __vehicle = null
      }
      return VehiclesFragmentArgs(__vehicle)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): VehiclesFragmentArgs {
      val __vehicle : Vehicle?
      if (savedStateHandle.contains("vehicle")) {
        if (Parcelable::class.java.isAssignableFrom(Vehicle::class.java) ||
            Serializable::class.java.isAssignableFrom(Vehicle::class.java)) {
          __vehicle = savedStateHandle.get<Vehicle?>("vehicle")
        } else {
          throw UnsupportedOperationException(Vehicle::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __vehicle = null
      }
      return VehiclesFragmentArgs(__vehicle)
    }
  }
}
