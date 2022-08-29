package for_loop;

import java.util.Scanner;

public class PrintRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        printRectangle(m, n);
        scanner.close();
        // implement here
    }

    private static void printRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print('8');
            }
            System.out.println();
        }
    }
}