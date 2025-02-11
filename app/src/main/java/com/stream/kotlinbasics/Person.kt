package com.stream.googlesignin.alka

class Person(val firstName: String = "A", val lastName: String = "B") {
    var nickname: String? = null
        set(value) {
            println("Set new value")
            field = value
        }
        get() {
            println("Get old value")
            return field
        }

    fun printInfo() {
        var nicknameToPrint: String = nickname ?: "No nickname"
        println("Hello, $firstName, $lastName, $nicknameToPrint")
    }
}