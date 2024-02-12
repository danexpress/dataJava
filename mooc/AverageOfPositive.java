package mooc;

import java.util.Scanner;

public class AverageOfPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 0;
        int totalSum = 0;

        while (true) {
            System.out.println("Give me a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                totalSum = totalSum + number;
                totalNumbers++;
            }
        }
        if (totalSum <= 0) {
            System.out.println("Cannot calculate the average");

        } else {
            double average = (double) totalSum / totalNumbers;
            System.out.println("Average of the numbers: " + average);
        }

        scanner.close();
    }
}
