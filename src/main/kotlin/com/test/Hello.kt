package com.test

fun main() {
    //println("Hello Kotlin");
    //kotlin不需要使用new即可產生物件
    //Human().hello();
    //alt + 9  git資訊
    //alt + `  commit file
    val h = Human(66.5f,1.7f);
    h.hello();
    /*val age : Int = 19;
    var weight = 60.5f;
    var name:String; //若未先給值時，kotlin需要先給變數型態，否則因為無法自動推斷會出錯
    */
    println(h.bmi());
}

class Human (var weight : Float, var height : Float) {
    fun bmi():Float {
        val bmi = weight / (height * height);
        return bmi;
    }

    fun hello() {
        println("Hello Kotlin");
    }
}