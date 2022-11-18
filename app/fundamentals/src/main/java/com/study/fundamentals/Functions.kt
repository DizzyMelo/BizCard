package com.study.fundamentals

fun main() {
    calculate(start = 2, end = 20, modulo = 6, message = "is a multiple of")
}

fun calculate(start: Int = 1, end:Int = 100, modulo: Int = 2, message: String = "is divisible by") {
    for (i in start..end) {
        if (i % modulo == 0) println("number $i $message $modulo")
    }
}