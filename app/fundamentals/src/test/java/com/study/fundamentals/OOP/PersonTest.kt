package com.study.fundamentals.OOP

import junit.framework.TestCase

class PersonTest : TestCase() {
    private val person: Person = Person(name = "Daniel", age = 28)
    fun testIncrementAge() {
        val result = person.incrementAge(increment = 5)
        assertEquals(33, result)
    }

    fun testIncrementAge_Fail() {
        val result = person.incrementAge()
        assertNotSame(28, result)
    }
}