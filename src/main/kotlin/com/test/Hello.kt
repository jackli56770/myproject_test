package com.test

fun main() {
    //println("Hello Kotlin");
    //kotlin不需要使用new即可產生物件
    //Human().hello();
    val h = Human();
    h.hello();
    val age : Int = 19;
    var weight = 60.5f;
    var name:String; //若未先給值時，kotlin需要先給變數型態，否則因為無法自動推斷會出錯
    //alt + 9  git資訊
    //alt + `  commit file
}

class Human {
    fun hello() {
        println("Hello Kotlin");
    }
}