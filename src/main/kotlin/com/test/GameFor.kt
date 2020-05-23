package com.test

import java.util.*

fun main() {
    val secretNum = Random().nextInt(10) + 1;
    val scanner = Scanner(System.`in`);
    for (i in 1..4) {
        println("Please enter a number:(${i}/4)");
        var number = scanner.nextInt();
        println("第${i}次:${number}");
        if (number > secretNum) {
            println("Lower!")
        } else if (number < secretNum) {
            println("Higher!")
        } else {
            println("Correct!")
            break;
        }
    }
}