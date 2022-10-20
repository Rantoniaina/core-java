import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class StaticImports {
    public static void main(String[] args) {
        out.println("Insert first number to raised by 4 and second number to calculate square root");
        Scanner scanner = new Scanner(in);
        int num1 = parseInt(scanner.next());
        int num2 = parseInt(scanner.next());
        double result1 = pow(num1, 4);
        double result2 = sqrt(num2);
        out.println(num1 + " raised by 4 equals " + result1);
        out.println("Square root of " + num2 + " equals " + result2);
    }
}
