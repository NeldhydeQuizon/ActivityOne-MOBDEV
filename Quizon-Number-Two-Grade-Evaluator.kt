package com.example.quizon_neldhyde_activityone

fun main() {
    val grades = listOf(85, 42, 70, 58, 90)
    for (x in grades) {
        if ( x >= 60 ){
            println(" $x is Pass")
        } else {
            println(" $x is Fail")
        }
    }
}
