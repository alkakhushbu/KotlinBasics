package com.stream.kotlinbasics.factory

interface IdProvider {
    fun getId(): String
}

class EntityFactory private constructor(private val id: String) : IdProvider {

    // companion object can access private methods and fields
    // companion object can be accessed from outside the scope of class
    companion object {
        const val name = "A"
        fun create(id: String) = EntityFactory(id)
    }

    override fun getId(): String {
        return name + id
    }
}

fun main() {
    val entity = EntityFactory.create("123")
    println(entity.getId())
}