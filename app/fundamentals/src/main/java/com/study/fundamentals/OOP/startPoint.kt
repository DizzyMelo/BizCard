package com.study.fundamentals.OOP

fun main() {
    val car = Car(color = "Pink", model = "VW")
    println(car.color)
    println(car.model)
    car.drive()
    car.speed(100, 200)

    val truck = Truck(model = "F250")
    truck.drive()
    truck.speed(10, 90)

    val button = Button(label = "button")
    button.onClick("This is the message")

    val character = Character(label = "character")
    character.onClick("new character created")

    fun callClickMethod(click: ClickEvent, message: String) {
        click.onClick(message)
    }

    callClickMethod(character, "cla clasasdf")
}