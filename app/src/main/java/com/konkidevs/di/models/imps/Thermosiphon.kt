package com.konkidevs.di.models.imps

import com.konkidevs.di.models.Heater
import com.konkidevs.di.models.Pump
import javax.inject.Inject


data class Thermosiphon @Inject constructor(private val heat: Heater): Pump