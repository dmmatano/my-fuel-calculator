package com.example.myfuelcalculator.ui.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.myfuelcalculator.R
import com.example.myfuelcalculator.model.Vehicle
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToVehiclesFragment(
    public val vehicle: Vehicle? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_vehiclesFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Vehicle::class.java)) {
          result.putParcelable("vehicle", this.vehicle as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Vehicle::class.java)) {
          result.putSerializable("vehicle", this.vehicle as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToCalculatorFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_calculatorFragment)

    public fun actionHomeFragmentToVehiclesFragment(vehicle: Vehicle? = null): NavDirections =
        ActionHomeFragmentToVehiclesFragment(vehicle)
  }
}
