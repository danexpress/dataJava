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

}
