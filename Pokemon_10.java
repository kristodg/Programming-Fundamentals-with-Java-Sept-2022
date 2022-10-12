package DataTypesEx;

import java.util.Scanner;

public class Pokemon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //poke power --> N integer
        int powerN = Integer.parseInt(scanner.nextLine());
        //distance between poke targets --> M integer
        int distanceM = Integer.parseInt(scanner.nextLine());
        //exhaustionFactor Y – an integer
        int factorY = Integer.parseInt(scanner.nextLine());
        //stop = power>= distance
        int firstPower = powerN;
        int pokes = 0;
        while(powerN >= distanceM){
            powerN -= distanceM;
            pokes++;

            if (powerN == firstPower / 2 ){
                if(factorY != 0) {
                    powerN = powerN / factorY;
                }
            }
        }
        System.out.println(powerN);
        System.out.println(pokes);
    }
}
