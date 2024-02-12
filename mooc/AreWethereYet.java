package mooc;

import java.util.Scanner;

public class AreWethereYet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 4) {
                break;
            }

        }

        scanner.close();

    }

}
