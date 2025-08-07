package com.example.quizon_neldhyde_activityone

fun main() {
    val mixedList: List<Any> = listOf("Hello MOBDEV", 123, true)

    for (item in mixedList) {
        when (item) {
            is String -> println("$item is a string")
            is Int -> println("$item is a number")
            is Boolean -> println("$item is a boolean")
            else -> println("$item is of an unknown type!")
        }
    }
}
