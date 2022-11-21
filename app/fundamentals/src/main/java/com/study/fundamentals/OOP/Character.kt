package com.study.fundamentals.OOP

class Character(val label: String): ClickEvent {
    override fun onClick(message: String) {
        println("$message sent from $label")
    }

}