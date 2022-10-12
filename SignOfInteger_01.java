package Methods;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int numInput = Integer.parseInt(scanner.nextLine());

            printNumbersSign(numInput);
    }

    public static void printNumbersSign(int num) {
        if ( num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }
}
