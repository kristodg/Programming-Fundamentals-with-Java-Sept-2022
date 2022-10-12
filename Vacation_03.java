package Basic_Syntax_Conditional_Statements_and_Loops_Ex;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double price = 0;

        if (dayOfTheWeek.equals("Friday")) {
            if (typeOfGroup.equals("Students")) {
                price = 8.45;
                if (groupPeople >= 30){
                    price = price * 0.85;
                }

            } else if (typeOfGroup.equals("Business")) {
                price = 10.90;
                if (groupPeople >= 100){
                    groupPeople -= 10;
                }
            } else if (typeOfGroup.equals("Regular")) {
                price = 15;
                if (groupPeople >= 10 && groupPeople <= 20){
                    price = price * 0.95;
                }
            }
        } else if (dayOfTheWeek.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                price = 9.80;
                if (groupPeople >= 30){
                    price = price * 0.85;
                }
            } else if (typeOfGroup.equals("Business")) {
                price = 15.60;
                if (groupPeople >= 100){
                    groupPeople -= 10;
                }
            } else if (typeOfGroup.equals("Regular")) {
                price = 20;
                if (groupPeople >= 10 && groupPeople <= 20){
                    price = price * 0.95;
                }
            }

        } else if (dayOfTheWeek.equals("Sunday")) {
            if (typeOfGroup.equals("Students")) {
                price = 10.46;
                if (groupPeople >= 30){
                    price = price * 0.85;
                }

            } else if (typeOfGroup.equals("Business")) {
                price = 16;
                if (groupPeople >= 100){
                    groupPeople -= 10;
                }
            } else if (typeOfGroup.equals("Regular")) {
                price = 22.50;
                if (groupPeople >= 10 && groupPeople <= 20) {
                    price = price * 0.95;

                }
            }
        }



        double totalPrice = price * groupPeople;
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
