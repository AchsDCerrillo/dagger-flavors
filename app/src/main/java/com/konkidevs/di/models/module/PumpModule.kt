package com.konkidevs.di.models.module

import dagger.Module
import com.konkidevs.di.models.imps.Thermosiphon
import com.konkidevs.di.models.Pump
import dagger.Binds



@Module
abstract class PumpModule {

    @Binds
    internal abstract fun providePump(pump: Thermosiphon): Pump

}