package mooc;

import java.util.Scanner;

public class AverageOfNumbers {
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

        double average = (double) totalSum / totalNumbers;
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}
