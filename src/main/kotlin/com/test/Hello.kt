package com.test

fun main() {
    //println("Hello Kotlin");
    //kotlin不需要使用new即可產生物件
    //Human().hello();
    //alt + 9  git資訊
    //alt + `  commit file
    val h = Human(weight = 66.5f, height = 1.7f);
    h.hello();
    /*val age : Int = 19;
    var weight = 60.5f;
    var name:String; //若未先給值時，kotlin需要先給變數型態，否則因為無法自動推斷會出錯
    */
    println(h.bmi());

    var s:String? = null;
    println(s?.length);
    println(s?.substring(3));
    println(s?.get(3));
//    println(s!!.length);//兩個驚嘆號代表要自己處理exception
}

//kt 分主要建構子與次要建構子
//主要建構子 - 可省略constructor
//參數可給初始值
class Human (var name : String = "", var weight : Float, var height : Float) {
    init {
        println("test $weight");//kt可在字串中以錢字號抓出變數值
    }

    //次要建構子
    //    constructor(name:String, weight: Float, height: Float) : this(weight, height)

    fun bmi():Float {
        val bmi = weight / (height * height);
        return bmi;
    }

    fun hello() {
        println("Hello Kotlin");
    }
}