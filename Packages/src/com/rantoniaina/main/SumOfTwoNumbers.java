package com.rantoniaina.main;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two integers");
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());
        int result = num1 + num2;
        System.out.println("Sum is " + result);
    }
}
