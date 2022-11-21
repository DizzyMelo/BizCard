package com.study.fundamentals.OOP

open class Person(private var name: String = "", private var age: Int = 0) {
    fun incrementAge(increment: Int = 1) : Int {
        return age + increment
    }
}