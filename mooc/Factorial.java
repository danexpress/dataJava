package mooc;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give me a number");
        int num1 = Integer.valueOf(reader.nextLine());

        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
        reader.close();
    }

}
