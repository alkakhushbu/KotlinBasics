package com.stream.googlesignin.alka

fun main() {
    // anonymous classes
    val infoProvider = object : PersonInfoProvider {
        override val infoProvider: String
            get() = "Person Info Provider"

    }

    infoProvider.printInfo(Person())
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("is a session Info provider")
        println(infoProvider.getSessionId())
    } else {
        println("not a session info provider")
    }
}