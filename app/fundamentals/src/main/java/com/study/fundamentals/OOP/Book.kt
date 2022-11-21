package com.study.fundamentals.OOP

data class Book(val title: String, val author: String, val releaseYear: Int) {
}

fun main() {
    val book = Book(title = "Atomic Habits", author = "Gales", releaseYear = 2019)
    val book3 = Book(title = "Atomic Habits", author = "Gales", releaseYear = 2019)
    val book2 = Book(title = "BHM", author = "Gales", releaseYear = 2010)

    val books = listOf(book, book2)
    books.forEach { book ->
        println(book.releaseYear)
    }

    println(book == book3)
}