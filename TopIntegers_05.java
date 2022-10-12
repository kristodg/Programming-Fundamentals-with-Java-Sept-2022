package Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split( " "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        for (int index = 0; index <= numbers.length - 1 ; index++) {
            int currentNum = numbers[index];
            //обхождам вс числа след моето
            if (index == numbers.length - 1){
                System.out.print(currentNum + " ");
                break;
            }
                boolean isTop = false;
            for (int i = index + 1; i <= numbers.length -1 ; i++) {
                int nextNumber = numbers[i];
                if (currentNum > nextNumber){
                    isTop = true;
                }else {
                    isTop = false;
                    break;
                }
            }

            if (isTop){
                System.out.print(currentNum + " ");
            }
        }
    }
}
