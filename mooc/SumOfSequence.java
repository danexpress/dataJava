package mooc;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Last number");
        int num = Integer.valueOf(reader.nextLine());
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
        reader.close();
    }
}
