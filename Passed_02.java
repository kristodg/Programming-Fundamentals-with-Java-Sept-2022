package BasicSyntax_ConditionalStatements_and_Loops;

import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3.00){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
