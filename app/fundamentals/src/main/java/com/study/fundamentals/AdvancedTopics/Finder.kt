package com.study.fundamentals.AdvancedTopics


fun main() {
    val listOfItems = listOf("Daniel", "Michael", "James")
    val listOfNumbers = listOf(6,9,30,63,5)
    val finder = Finder(listOfNumbers)
    finder.findItem(element = 97) {
        println("Found $it")
    }
}

class Finder<T>(private val list: List<T>) {
    fun findItem(element: T, foundItem: (element:T?) -> Unit) {
        val itemFoundList = list.filter {
            it == element
        }

        if (itemFoundList.isNullOrEmpty()) foundItem(null) else
            foundItem(itemFoundList.first())
    }

}