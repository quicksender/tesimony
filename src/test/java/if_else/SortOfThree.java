package if_else;

import java.util.Scanner;

public class SortOfThree {
    /*
    Enter and reed three numbers from the console
    Implement method which prints them from highest to lowest
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        printFromHighestToLowest(one, two, three);
        scanner.close();
    }

    private static void printFromHighestToLowest(int a, int b, int c) {
        int min = a;
        int med = b;
        int max = c;
        if (a > b) {
            if (a > c) {
                max = a;
                if (b > c) {
                    med = b;
                    min = c;
                } else {
                    med = c;
                    min = b;
                }
            } else {
                med = a;
                max = c;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                if (a > c) {
                    med = a;
                    min = c;
                } else {
                    med = c;
                    min = a;
                }
            } else {
                med = b;
                max = c;
                min = a;
            }
        }
        System.out.print(max + " " + med + " " + min);
    }
}