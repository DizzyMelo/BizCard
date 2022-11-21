package com.study.fundamentals.OOP

open class Car(var color: String = "Blue",
          var model: String = "BMW"){

    init {
        println("One new object in being created")
    }

    open fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed: $minSpeed")
        println("Max speed: $maxSpeed")
    }

    open fun drive() {
        print("The car is moving")
    }
}