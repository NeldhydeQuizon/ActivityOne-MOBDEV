package com.example.quizon_neldhyde_activityone

fun main() {
    val numbers = (1..20).toList()
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val doubleEvens = evenNumbers.map { it * 2 }

    print("Even Numbers: $evenNumbers")
    println("Doubled Even Numbers: $doubleEvens")
}
