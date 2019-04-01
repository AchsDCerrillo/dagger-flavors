package com.konkidevs.core.configuration

import com.konkidevs.core.configuration.modules.NetworkModule
import com.konkidevs.core.repository.Api
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ NetworkModule::class ])
interface AppComponent {
    fun api(): Api
}