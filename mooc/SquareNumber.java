package mooc;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = Integer.valueOf(reader.nextLine());
        int square = num * num;

        System.out.println("Square of the number: " + square);

        reader.close();
    }
}
