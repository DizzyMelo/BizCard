package com.study.fundamentals

fun main() {
    calculate(start = 2, end = 20, modulo = 6, message = "is a multiple of")
    val catAge = calculateCatAge(age = 20)

    if (checkAge(age = catAge)) {
        println("The cat is old")
    } else {
        println("The cat is young")
    }
    println(checkAge(age = catAge))
}

fun calculateCatAge(age: Int): Int = age * 7

fun checkAge(age: Int): Boolean = age > 60

fun calculate(start: Int = 1, end:Int = 100, modulo: Int = 2, message: String = "is divisible by") {
    for (i in start..end) {
        if (i % modulo == 0) println("number $i $message $modulo")
    }
}