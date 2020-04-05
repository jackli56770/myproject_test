package com.test.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNum = random.nextInt(10) + 1;
        System.out.println(secretNum);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secretNum) {
            System.out.println("Please enter a number");
            number = scanner.nextInt();
            if (number > secretNum) {
                System.out.println("Lower!");
            } else if(number < secretNum) {
                System.out.println("Higher!");
            } else {
                System.out.println("Correct!");
            }
        }

/*        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 3); {

        }*/
    }
}
