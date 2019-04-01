package com.konkidevs.di

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.konkidevs.di.models.CoffeeShop
import com.konkidevs.di.models.DaggerCoffeeShop

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val coffeShop: CoffeeShop = DaggerCoffeeShop.create()
        val coffeeMaker = coffeShop.maker()

        coffeeMaker.sayHello()

    }
}
