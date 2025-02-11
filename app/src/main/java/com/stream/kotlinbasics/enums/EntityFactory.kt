package com.stream.kotlinbasics.enums

import java.util.Locale
import java.util.UUID

enum class EntityType {
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.lowercase()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }
}

object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = type.getFormattedName()
//            when(type) {
//            EntityType.EASY -> type.name
//            EntityType.MEDIUM -> "Medium"
//            EntityType.HARD -> "Hard"
//        }
        return Entity(id, name)
    }
}

class Entity(val id: String, val name: String) {
    override fun toString(): String {
        return "Entity(id='$id', name='$name')"
    }
}

fun main() {
    var entity = EntityFactory.create(EntityType.EASY)
    println(entity)
    entity = EntityFactory.create(EntityType.HARD)
    println(entity)
    entity = EntityFactory.create(EntityType.MEDIUM)
    println(entity)
}