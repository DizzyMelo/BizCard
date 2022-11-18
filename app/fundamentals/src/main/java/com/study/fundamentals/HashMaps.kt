package com.study.fundamentals

fun main() {
    val hashMap = mutableMapOf<String, Int>("Up" to 1, "Left" to 3, "Right" to 4, "Down" to 5)
    hashMap["a"] = 5
    println(hashMap)
    println(hashMap.keys)
    println(hashMap.values)
}