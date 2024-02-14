package mooc;

import java.util.Scanner;

public class AbsoluteNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());

        int abs = Math.abs(num);
        System.out.println(abs);

        scanner.close();

    }
}
