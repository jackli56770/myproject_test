package com.test.kotlin

fun main() {
    val  student = Student("test", 60, 77);
    student.print();
}

class  Student(var name:String, var english:Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t" + (english + math) / 2);
    }
}