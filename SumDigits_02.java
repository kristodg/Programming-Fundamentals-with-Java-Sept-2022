package DataTypesEx;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = Integer.parseInt(scanner.nextLine());

         while ( number > 0){
             int lastDigit = number % 10;
             sum += lastDigit;
             number = number / 10;

         }

        System.out.println(sum);
    }
}
