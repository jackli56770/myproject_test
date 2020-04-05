package com.test.kotlin

import java.util.*

fun main() {
    userInput();
}

class Student(var name:String?, var english:Int, var math: Int) {
    fun print() {
/*        print(name + "\t" + english + "\t" + math + "\t" + getAverage()
                    + "\t" + getPassOrFailed());
        println("\t" + grading());*/
        print("$name\t$english\t$math\t${getAverage()}\t${getPassOrFailed()}\t${grading()}");
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
            english;
        } else {
            println("math")
            math;
        }

        return max;
    }

    fun getPassOrFailed() = if(getAverage() >=60) "PASS" else "FAILED";

/*    fun grading() : Char {
        var grading : Char = when(getAverage()) {
            in 90..100 -> 'A';
            in 80..89 -> 'B';
            in 70..79 -> 'C';
            in 60..69 -> 'D';
            else -> 'F';
        }
        return grading
    }*/
    // kt function 判斷式可以直接當作右邊
    fun grading() = when(getAverage()) {
        in 90..100 -> 'A';
        in 80..89 -> 'B';
        in 70..79 -> 'C';
        in 60..69 -> 'D';
        else -> 'F';
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

    val student = Student(name, english, math);
    student.print();
/*    student.nameCheck();
    println("HighScore:${student.highest()}");*/
}