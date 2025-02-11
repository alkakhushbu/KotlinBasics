package com.stream.kotlinbasics.functional

fun main() {
    var list = listOf("Java", "C++", "JavaScript", "Kotlin")
    //
    list
        .filter {
            it.startsWith("J")
        }
        .forEach {
            println(it)
        }


    // filterNotNull is used
    var list2 = listOf("Java", "C++", "JavaScript", null, "Kotlin", null)
    list2
        .filterNotNull()
        .filter {
            it.startsWith("J")
        }
        .forEach {
            println(it)
        }


    //map
    var list3 = list
        .map {
            it.length
        }
        .forEach {
            println(it)
        }
    println("list3: $list3")

    // we can do other transformation on list using lambda expression like takeLast 3 or so on

    // string to length map => use associate
    var strLenMap = list2
        .filterNotNull()
        .associate {
            it to it.length
        }
    println(strLenMap)


    // print first and last value in list2
    println(list2.first() + " " + list2.last())

    // print first and last non null values
    println(list2.filterNotNull().first() + " " + list2.filterNotNull().last())

    // find first non null string that matches the predicate
    println(list2.filterNotNull().find { it.startsWith("J") })

    // find last non null string that matches the predicate
    println(list2.filterNotNull().findLast { it.startsWith("J") })

    // find first non null string that matches the predicate
    // print empty if predicate not found
    // remove orEmpty() and it will print null
    println(list2.filterNotNull().find { it.startsWith("G") }.orEmpty())
}