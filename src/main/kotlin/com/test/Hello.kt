package com.test

fun main() {
    //println("Hello Kotlin");
    //kotlin不需要使用new即可產生物件
    //Human().hello();
    val h = Human();
    h.hello();
}

class Human {
    fun hello() {
        println("Hello Kotlin");
    }
}