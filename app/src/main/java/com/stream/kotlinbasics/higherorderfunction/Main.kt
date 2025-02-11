package com.stream.kotlinbasics.higherorderfunction

import androidx.core.util.Predicate

// Advanced functions
// Functional datatypes

// Higher order function:
    // Return another function or take function as parameters


fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach {
        if (predicate(it)) {
            println(it)
        }
    }
}

fun printFilteredStringsNullable(list: List<String>, predicate: ((String) -> Boolean)?) {
    println("Inside printFilteredStringsNullable")
    list.forEach {
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

// predicate is a function type that takes String as parameter and returns Boolean
val predicate: (String) -> Boolean = {
    it.startsWith("J")
}

// function that returns another function
fun getPrintPredicate(): (String) -> Boolean {

    // return lambda expression
    return {
        it.startsWith("J")
    }
}

fun main() {
    val input = listOf("C++", "Java", "Kotlin")
//    printFilteredStrings(input, {it.startsWith("K")})
//
//    // Another way to do this. Use lambda syntax
//    // Last argument is a function so we can put it's implementation inside curly braces AKA lambda expression
//    printFilteredStrings(input) {
//        it.startsWith("K")
//    }
//
//    printFilteredStringsNullable(input, null)

//    printFilteredStrings(input, predicate)
    printFilteredStrings(input, getPrintPredicate())
}