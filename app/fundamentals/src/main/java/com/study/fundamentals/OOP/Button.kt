package com.study.fundamentals.OOP

class Button(val label: String): ClickEvent {
    override fun onClick(message: String) {
        println("$label: $message")
    }
}