package com.study.fundamentals

fun main() {
    calculate(start = 2, end = 20, modulo = 6)
}

fun calculate(start: Int = 1, end:Int = 100, modulo: Int = 2) {
    for (i in start..end) {
        if (i % modulo == 0) println("number $i is a multiple of $modulo")
    }
}