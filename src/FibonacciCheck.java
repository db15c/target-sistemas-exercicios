import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, insert an integer number: ");
        int userNumber = scanner.nextInt();

        String returnFibonacci = (isFibonacci(userNumber)) ?
                "The number " + userNumber + " belongs to the Fibonacci sequence." :
                "The number " + userNumber + " does NOT belong to the Fibonacci sequence.";

        System.out.println(returnFibonacci);

        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;

        while (a <= number) {
            if (a == number) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
}
