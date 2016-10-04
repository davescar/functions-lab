package com.DAVE;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        stringLength("Hi Drew(s)");
        System.out.println(isEven(17));
        userInput();
        typeQuit();
    }

    public static void stringLength(String howLong) {
        System.out.println(howLong.length());
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void userInput() {
        Scanner input = new Scanner(System.in);
        String b = input.nextLine();
        System.out.println(b);
    }

    public static void typeQuit() {
        Scanner userType = new Scanner(System.in);
        String exit = userType.nextLine();
        System.out.println(exit);

        if (exit.equals("quit")) {
            return;
        } else {
            typeQuit();

        }
    }
}




