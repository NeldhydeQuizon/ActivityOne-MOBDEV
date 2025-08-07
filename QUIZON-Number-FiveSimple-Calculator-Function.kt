package com.example.quizon_neldhyde_activityone

fun main() {
    val firstNumber = 10
    val secondNumber = 5

    print("Please enter an operator (+, -, *, /): ")

    val operator = readln()

    var result = 0

    when (operator) {
        "+" -> result = (firstNumber + secondNumber)
        "-" -> result = (firstNumber - secondNumber)
        "*" -> result = (firstNumber * secondNumber)
        "/" -> result = firstNumber / secondNumber
        else -> {
            println("Unknown operator")
        }
    }

    println("The result is $firstNumber $operator $secondNumber = $result")
}
