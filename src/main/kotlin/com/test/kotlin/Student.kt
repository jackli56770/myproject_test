package com.test.kotlin

import java.util.*

fun main() {
    userInput();
}

class Student(var name:String?, var english:Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t" + getAverage()
                    + "\t" + if(getAverage() >=60) "PASS" else "FAILED");
    }

    fun getAverage() :Int {
        return (english + math) / 2
    }

    fun nameCheck() {
        println(name?.length);
        if (name != null)
            println(name?.length);

    }

    fun highest() : Int {
        var max = if(english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }

        return max;
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`);//兩個重音符號加關鍵詞即可使用，如此的in
    println("please enter student name:")
    val name = scanner.next()

    println("please enter student english:")
    val english = scanner.nextInt()

    println("please enter student math:")
    val math = scanner.nextInt()

    val  student = Student(name, english, math);
    student.print();
    student.nameCheck();
    println("HighScore:${student.highest()}");
}