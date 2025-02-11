package com.stream.kotlinbasics.extentions

import java.util.Locale
import java.util.UUID

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.lowercase()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }
}

object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.name
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedName()
        }
        val entity = when(type) {
            EntityType.HELP -> Entity.Help
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 0.1f)
        }
        return entity
    }
}

sealed class Entity() {
    //object decoration
    object Help : Entity() {
        val name = "Help"
    }

    //class decoration
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()

}

// Function extension
fun Entity.Medium.printInfo() {
    println("id: $id, name: $name")
}

// Field extension
val Entity.Medium.info: String
    get() = "Medium info"

fun main() {
    val entity = Entity.Medium("id", "name")
    if (entity is Entity.Medium) {
        entity.printInfo()
        entity.info
    }
}