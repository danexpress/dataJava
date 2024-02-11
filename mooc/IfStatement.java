package mooc;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = Integer.valueOf(reader.nextLine());

        if (first < 0) {
            int posFirst = first * -1;
            System.out.print(posFirst);
        } else {
            System.out.print(first);
        }
        reader.close();
    }
}
