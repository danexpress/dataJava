package mooc;

import java.util.Scanner;

public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 0;
        while (true) {
            System.out.println("Give me a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            totalNumbers++;
        }

        System.out.println("Number of numbers: " + totalNumbers);
        scanner.close();
    }

}
