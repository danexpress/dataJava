package mooc;

import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = Integer.valueOf(reader.nextLine());
        System.out.println("Enter the second number:");
        int second = Integer.valueOf(reader.nextLine());

        double squareRoot1 = Math.sqrt(first);
        double squareRoot2 = Math.sqrt(second);

        int sum = (int) (squareRoot1 + squareRoot2);

        System.out.println("Square root of the sum of numbers: " + sum);

        reader.close();
    }
}
