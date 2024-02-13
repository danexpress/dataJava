package mooc;

import java.util.Scanner;

public class SumOfSequenceSequel {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First number");
        int num1 = Integer.valueOf(reader.nextLine());

        System.out.println("Last number");
        int num2 = Integer.valueOf(reader.nextLine());
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
        reader.close();
    }
}
