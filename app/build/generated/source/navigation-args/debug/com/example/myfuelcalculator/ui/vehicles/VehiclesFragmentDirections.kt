package com.example.myfuelcalculator.ui.vehicles

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.myfuelcalculator.R

public class VehiclesFragmentDirections private constructor() {
  public companion object {
    public fun actionVehiclesFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_vehiclesFragment_to_homeFragment)

    public fun actionVehiclesFragmentToFipeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_vehiclesFragment_to_fipeFragment)
  }
}
