package mooc;

import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give me a number:");
            System.out.println();
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            else if (number == 0) {
                break;
            } else {
                int powertwo = (int) Math.pow(number, 2);
                System.out.println(powertwo);
            }

            System.out.print(number + " ");
        }
        scanner.close();

    }
}
