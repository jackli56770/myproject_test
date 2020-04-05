package com.test

import java.util.*

fun main() {
    var secretNum = Random().nextInt(10) + 1;
    println(secretNum);
//    val scanner = Scanner(System.`in`);
    var number = 0
    while (number != secretNum) {
        println("Please enter a number")
//        number = scanner.nextInt()
        number = readLine()!!.toInt();
        if (number > secretNum) {
            println("Lower!")
        } else if (number < secretNum) {
            println("Higher!")
        } else {
            println("Correct!")
        }
    }
}