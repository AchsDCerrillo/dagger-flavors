package com.konkidevs.di.models.module

import com.konkidevs.di.models.Heater
import com.konkidevs.di.models.imps.ElectricHeater
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ PumpModule::class ])
class DripCoffeeModule {

    @Provides @Singleton fun provideHeater(): Heater = ElectricHeater()

}