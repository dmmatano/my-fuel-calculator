package com.example.myfuelcalculator.ui.calculator

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.myfuelcalculator.R

public class CalculatorFragmentDirections private constructor() {
  public companion object {
    public fun actionCalculatorFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_calculatorFragment_to_homeFragment)
  }
}
