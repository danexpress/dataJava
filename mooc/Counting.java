package mooc;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = Integer.valueOf(reader.nextLine());
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

        reader.close();
    }
}
