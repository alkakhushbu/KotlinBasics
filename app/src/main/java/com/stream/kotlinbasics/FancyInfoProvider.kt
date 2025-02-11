package com.stream.googlesignin.alka

class FancyInfoProvider :BasicInfoProvider() {
    override val infoProvider: String
        get() = "Fancy Info Provider"

    override val sessionIdPrefix: String = "Fancy Session"

    override fun getSessionId(): String {
        return sessionIdPrefix
    }

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println(infoProvider)
    }
}