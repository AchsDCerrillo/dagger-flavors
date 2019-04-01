package com.konkidevs.core.configuration.modules

import com.konkidevs.core.repository.Api
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides @Singleton
    fun api(): Api = Api.create()

}