package com.study.fundamentals

fun main() {
    val amount = 0

    if (amount == 1000) {
        print("You are wealthy")
    } else if (amount > 1000) {
        print("Wow! You are rich")
    } else {
        print("You are doing just fine")
    }

    when(amount) {
        in 1..100 -> print("You have 100")
        !in 1..100 -> print("Amount not in range")
        200 -> print("You have 200")
        300 -> print("You have 300")
        400 -> print("You have 400")
        else -> print("no value")
    }
}
