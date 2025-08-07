package com.example.quizon_neldhyde_activityone

fun main() {
    val numbers = listOf(85, 42, 70, 58, 90)
    var maxNumber = numbers[0]

    for (number in numbers) {
        if (number > maxNumber) {
            maxNumber = number
        }
    }
    println("The maximum number is: $maxNumber")
}
