package com.stream.kotlinbasics.factory

object TruckFactory {
    fun create() = Truck("123", "A")
}

class Truck (val id: String, val driverName: String) {
    override fun toString(): String {
        return "Truck(id='$id', driverName='$driverName')"
    }
}

fun main() {
    val truck = TruckFactory.create()
    println(truck)
}