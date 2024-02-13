package mooc;

import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = Integer.valueOf(reader.nextLine());
        for (int i = num; i <= 100; i++) {
            System.out.println(i);
        }

        reader.close();
    }
}
