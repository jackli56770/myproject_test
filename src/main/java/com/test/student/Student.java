package com.test.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    //alt + insert可以產生建構子
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
        int max = (english > math)? english : math;
//        if (english > math) {
//            max = english;
//        } else {
//            max = math;
//        }

        return max;
    }

    public void print() {
        System.out.print(name + "\t" + english + "\t" + math
                + "\t" + getAverage() );
        if(getAverage() >= 60) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }
    }

    public int getAverage() {
        return  (english + math) / 2;
    }


}
