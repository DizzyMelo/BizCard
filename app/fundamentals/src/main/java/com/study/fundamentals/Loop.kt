package com.study.fundamentals

fun main() {
    val start = 1
    val end = 1000
    for (i in start..end){
        if (i % 3 == 0) {
            println("$i is a multiple of 3")
        }
    }
}