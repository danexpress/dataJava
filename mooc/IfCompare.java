package mooc;

import java.util.Scanner;

public class IfCompare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = Integer.valueOf(reader.nextLine());
        System.out.println("Enter the second number:");
        int second = Integer.valueOf(reader.nextLine());

        if (first > second) {

            System.out.print(first + " is greater than " + second);
        } else if (second > first) {
            System.out.print(first + " is smaller than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }
        reader.close();
    }
}
