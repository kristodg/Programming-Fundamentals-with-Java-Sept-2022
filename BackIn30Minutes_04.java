package BasicSyntax_ConditionalStatements_and_Loops;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inithour = Integer.parseInt(scanner.nextLine());
        int initmin = Integer.parseInt(scanner.nextLine());

        int allMinutes = (inithour * 60) + initmin + 30;

        int hour = allMinutes / 60;
        int minutes = allMinutes % 60;

        if(hour >= 24){
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, minutes);

    }
}
