package com.rantoniaina.main;

import java.util.Scanner;

import static java.lang.Integer.*;
import static java.lang.System.*;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        out.println("Enter two integers");
        Scanner scanner = new Scanner(System.in);
        int num1 = parseInt(scanner.next());
        int num2 = parseInt(scanner.next());
        int result = num1 + num2;
        out.println("Sum is " + result);
    }
}
