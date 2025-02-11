package com.stream.kotlinbasics.factory

// create thread safe singleton. How?

class Singleton private constructor(val id: String, val name: String) {

    override fun toString(): String {
        return "Singleton(id='$id', name='$name')"
    }

    companion object {
        var singletonObject: Singleton? = null
            private set
        fun create(id: String, name: String) : Singleton {
            if (singletonObject != null) {
                return singletonObject as Singleton
            } else {
                singletonObject = Singleton(id, name)
                return singletonObject as Singleton
            }
        }
    }
}

fun main() {
    var singleton = Singleton.create("123", "A")
    println(singleton.toString())
    singleton = Singleton.create("234", "B")
    println(singleton.toString())
}