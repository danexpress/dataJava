package mooc;

public class AdvancedAstrology {

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        int j = size;
        for (int i = 1; i <= size; i++) {
            printSpaces(j);
            printStars(i);
            j--;

        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = height - 1;

        while (i <= height) {
            printSpaces(j);
            printStars(i * 2 - 1);
            i++;
            j--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        printTriangle(4);
        christmasTree(10);

    }
}
