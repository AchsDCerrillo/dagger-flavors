package com.konkidevs.di.models

import com.konkidevs.di.models.module.DripCoffeeModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ DripCoffeeModule::class ])
interface CoffeeShop {

    fun maker(): CoffeeMaker

}