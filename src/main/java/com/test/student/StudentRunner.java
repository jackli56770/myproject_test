package com.test.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        userInput();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter student name:");
        String name = scanner.next();

        System.out.println("please enter student english:");
        int english = scanner.nextInt();

        System.out.println("please enter student math:");
        int math = scanner.nextInt();

        Student student = new Student(name, english, math);
        student.print();
        System.out.println("High score:" + student.highest());
    }
}