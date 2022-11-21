package com.study.fundamentals.OOP

class Car(var color: String = "Blue",
          var model: String = "BMW"){

    init {
        print("One new object in being created")
    }

    fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed: $minSpeed")
        println("Max speed: $maxSpeed")
    }

    fun drive() {
        print("The car is moving")
    }
}