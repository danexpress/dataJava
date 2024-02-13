package mooc;

import java.util.Scanner;

public class ReapeatingBreaking {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give me a number");
        int sum = 0;
        int totalNumbers = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int num = Integer.valueOf(reader.nextLine());
            if (num < 0) {
                System.out.println("Thx! bye");
                break;
            }
            if (num % 2 == 0) {
                even++;
            } else if (num % 2 == 1) {
                odd++;
            }

            sum = sum + num;
            totalNumbers++;

        }
        double average = (double) sum / totalNumbers;

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average " + average);
        System.out.println("Even " + even);
        System.out.println("odd " + odd);

        reader.close();
    }

}
