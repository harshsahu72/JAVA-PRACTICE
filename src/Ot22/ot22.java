
package oct22;

import java.util.Scanner;

public class ot22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter first integer: ");
        int a = sc.nextInt();

        System.out.print("enter second integer: ");
        int b = sc.nextInt();

        System.out.println("addition = " + (a + b));
        System.out.println("subtraction = " + (a - b));
        System.out.println("multiplication = " + (a * b));

        try {
            System.out.println("Division = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}
