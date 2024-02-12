package mooc;

import java.util.Scanner;

public class NumberandSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 0;
        int totalSum = 0;
        while (true) {
            System.out.println("Give me a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            totalSum = totalSum + number;
            totalNumbers++;
        }
        System.out.println("Number of numbers:" + totalNumbers);
        System.out.println("Sum of the numbers: " + totalSum);

        scanner.close();
    }

}
