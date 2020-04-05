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
        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math
                + "\t" + getAverage() + ((average >= 60 ? "PASS" : "FAILED")) );
        /*if(getAverage() >= 60) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }*/

        char grading = 'F';
        switch (average / 10) {
            case 10 :
                grading = 'A';
                break;
            case 9 :
                grading = 'A';
                break;
            case 8 :
                grading = 'B';
                break;
            case 7 :
                grading = 'C';
                break;
            case 6 :
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println(grading);
    }

    public int getAverage() {
        return  (english + math) / 2;
    }


}
