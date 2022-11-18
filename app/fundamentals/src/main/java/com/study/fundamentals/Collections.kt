package com.study.fundamentals

fun main() {

//    val names = listOf("Daniel", "Kaynara", "May", "Gina")
    val names = mutableListOf(1,3,5,6,3,)
    names.add(0, 34564)
    names.removeAt(3)
    println("Number of elements is ${names.size}")
    println("Second of elements is ${names[1]}")
    println("Index of element 6 is ${names.indexOf(6)}")
    println(names)

    for (name in names) {
        println(name)
    }

    names.forEach { name ->
        println(name)
    }
}