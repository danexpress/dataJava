package mooc;

import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Where to?");
        int num = Integer.valueOf(reader.nextLine());
        System.out.print("Where from?");
        int num2 = Integer.valueOf(reader.nextLine());
        for (int i = num2; i <= num; i++) {
            System.out.println(i);
        }

        reader.close();
    }

}
