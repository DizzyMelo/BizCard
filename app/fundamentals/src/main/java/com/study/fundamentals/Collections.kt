package com.study.fundamentals

fun main() {

//    val names = listOf("Daniel", "Kaynara", "May", "Gina")
    val names = mutableListOf("Daniel", "Kay", "Matt")
    names.add(0, "Jose")
    names.removeAt(3)
    println("Number of elements is ${names.size}")
    println("Second of elements is ${names[1]}")
    println("Index of element 6 is ${names.indexOf("Daniel")}")
    println(names)

    val found = names.filter {
        it.length == 4
    }

    println("elements")
    println(found)

    val cities = mutableListOf<String>()
    val empty = emptyList<String>()
    val emptySet = emptySet<String>()
    val emptyMap = emptyMap<String, Boolean>()

    for(i in 1..10) {
        cities.add("Hey $i")
    }

    println(cities)

    for (name in names) {
        println(name)
    }

    names.forEach { name ->
        println(name)
    }
}