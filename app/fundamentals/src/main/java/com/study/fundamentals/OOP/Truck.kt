package com.study.fundamentals.OOP

class Truck(color: String = "Blue", model: String = "BMW") : Car(color, model) {

    override fun speed(minSpeed: Int, maxSpeed: Int) {
        println("a lot of speed ${minSpeed * maxSpeed}")
    }

    override fun drive() {
        println("Vrrom like a truck")
    }
}