package Arrays_Ex;

import java.util.Scanner;
import java.util.Arrays;


public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray(); //масив от числа

        int rotations = Integer.parseInt(scanner.nextLine()); //брой ротации
        
        for (int rotation = 1; rotation <= rotations; rotation++) {
            int firstElement = numbers[0];
            //обхождяму вс индекс от 1 до предпоследния

            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];

            }
            numbers[numbers.length - 1] = firstElement;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
