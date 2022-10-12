package BasicSyntax_ConditionalStatements_and_Loops;

import java.util.Scanner;

public class DivisibleBy3_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i <= 100 ; i+= 3) {
            System.out.println(i);
        }
    }
}
