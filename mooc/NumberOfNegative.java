package mooc;

import java.util.Scanner;

public class NumberOfNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 0;
        while (true) {
            System.out.println("Give me a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number < 0) {
                totalNumbers++;
            }

        }

        System.out.println("Number of numbers: " + totalNumbers);
        scanner.close();
    }

}
