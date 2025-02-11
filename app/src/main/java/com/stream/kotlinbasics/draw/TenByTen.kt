package com.stream.kotlinbasics.draw

/**
 * # # # # # # # # # #
 * #                 #
 * #                 #
 * #                 #
 * #                 #
 * #                 #
 * #                 #
 * #                 #
 * #                 #
 * # # # # # # # # # #
 */
fun main() {
    repeat(10) {x ->
        repeat(10) { y ->
            val text = if (x == 0 || y == 0 || x == 9 || y == 9) "# " else "  "
            print(text)
        }
        println()
    }
    println("\n\n")
    repeat(10) {x ->
        repeat(10) { y ->
            val text = if (x == 0 || y == 0 || x == 9 || y == 9 || x == y || x + y == 9) "# " else "  "
            print(text)
        }
        println()
    }
    println("\n\n")
    repeat(10) {x ->
        repeat(100) { y ->
            val text = if (x == 0 || x == 9 || y % 10 == 0 || y % 10 == 9 || x % 10 == y % 10 || (x + y) % 10 == 9) "# " else "  "
            print(text)
        }
        println()
    }
}

fun function1() {
    val start = 1
    val end = 10
    for (i in start..end) {
        print("# ")
        for (j in start+1..end-1) {
            if (i == start || i == end) {
                print("# ")
            } else {
                print("  ")
            }
        }
        println("# ")
    }
}