package mooc;

import java.util.Scanner;

public class InAHoleWhole {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many times");
        int num = Integer.valueOf(reader.nextLine());

        for (int i = 0; i < num; i++) {

            printText();
        }
        reader.close();

    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
