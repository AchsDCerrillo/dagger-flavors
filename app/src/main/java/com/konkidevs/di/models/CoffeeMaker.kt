package com.konkidevs.di.models

import android.util.Log
import javax.inject.Inject

data class CoffeeMaker @Inject constructor(val heater: Heater, val pump: Pump) {
    fun sayHello(){
        Log.i("Hello", "Say hello")
    }
}