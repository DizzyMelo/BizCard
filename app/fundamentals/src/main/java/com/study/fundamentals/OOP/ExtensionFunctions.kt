package com.study.fundamentals.OOP

fun main() {
    println("Hello Daniel ".append("!"))
    println("Hello Daniel".removeFirstAndLastChars())

}

fun String.append(toAppend: String): String = this.plus(toAppend)

fun String.removeFirstAndLastChars(): String = this.substring(1, this.length - 1)
