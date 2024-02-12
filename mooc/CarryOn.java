package mooc;

import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we continue");
            System.out.println();
            String input = scanner.nextLine();
            if (input.equals("no")) {
                break;
            }

            System.out.println("Shall we continue");
        }
        scanner.close();
    }

}
