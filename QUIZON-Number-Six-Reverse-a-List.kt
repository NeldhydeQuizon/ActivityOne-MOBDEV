package com.example.quizon_neldhyde_activityone

fun main() {
    val origList = listOf(10, 20, 30, 40, 50)
    val reversedList = mutableListOf<Int>()

    for (i in origList.size - 1 downTo 0) {
        reversedList.add(origList[i])
    }

    println("Original List: $origList")
    println("Reversed List: $reversedList")
}
