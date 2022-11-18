package com.study.fundamentals

fun main() {
    val hashSet = mutableSetOf("RN", "CE", "PB", "PE")
    hashSet.add("BA")
    hashSet.add("BH")
    hashSet.add("SP")
    hashSet.forEach {
        println(it)
    }
    print(hashSet)
}