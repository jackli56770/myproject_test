package com.test.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
//        int sum = 0;
//        for(int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
        int secretNum = new Random().nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.println("Please enter a number:(" + i + "/4");
            int number = scanner.nextInt();
            System.out.println("第1" + i + "次:" + number);
            if (number > secretNum) {
                System.out.println("Lower!");
            } else if(number < secretNum) {
                System.out.println("Higher!");
            } else {
                System.out.println("Correct!");
                break;
            }
        }
        System.out.println("End!");
    }
}
