package mooc;

import java.util.Scanner;

public class FromOneToParameter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = Integer.valueOf(reader.nextLine());

        printUntilNumber(num);
        System.out.println(" ");
        printFromNumberToOne(num);
        division(3, 5);
        divisibleByThreeInRange(2, 10);
        reader.close();

    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void division(int first, int second) {
        double divide = (double) first / second;
        System.out.println(divide);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
