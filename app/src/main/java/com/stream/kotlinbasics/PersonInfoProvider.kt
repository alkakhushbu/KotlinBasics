package com.stream.googlesignin.alka

// could be used as marker interface
interface PersonInfoProvider {
    val infoProvider: String
    fun printInfo(person: Person) {
        println("PersonInfoProvider $infoProvider")
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {
    override val infoProvider: String
        get() = "Basic Info Provider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}