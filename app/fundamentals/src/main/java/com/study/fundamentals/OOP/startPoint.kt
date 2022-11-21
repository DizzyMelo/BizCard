package com.study.fundamentals.OOP

fun main() {
    val car = Car(color = "Pink", model = "VW")
    println(car.color)
    println(car.model)
    car.drive()
    car.speed(100, 200)


}