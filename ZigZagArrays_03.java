package Arrays_Ex;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[rows];
        String[] secondArr = new String[rows];

        for (int row = 1; row <= rows; row++) {
            String [] numbers = scanner.nextLine().split( " ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];

            if (row % 2 == 0){
                //firstNum --> secondArr
                secondArr[row - 1] = firstNumber;
                //secondNum --> firstArr
                firstArr[row - 1] = secondNumber;

            }else{
                //firstNum --> firstArr
                firstArr[row - 1] = firstNumber;
                //secondNum --> secondArr
                secondArr[row - 1] = secondNumber;
            }
        }

        System.out.println(String.join( " ", firstArr));
        System.out.println(String.join( " ", secondArr));
    }
}
