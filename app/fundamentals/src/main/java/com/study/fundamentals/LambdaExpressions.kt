package com.study.fundamentals

fun main() {
    println(sum(79, 8))
    println(calculateCatAge(2))
    name("Daniel")
    enhancedMessage("Hello there"){
        print(it)
        2 + 8
    }
}

val calculateCatAge: (age:Int) -> Int = {it * 7}
val sum: (Int, Int) -> Int = {a, b -> a + b}

val name: (String) -> Unit = {print(it)}
fun  showName(name: String) {
    print(name)
}

fun enhancedMessage(message: String, funAsParameter: (String) -> Int) {
    println("$message ${funAsParameter("Hey")}")
}
