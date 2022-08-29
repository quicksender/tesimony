package while_loop;

import java.util.Scanner;

public class PrintStringNTimes {
    /*
    Enter from the console a string and a number
    Print string n times
    using loop while
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        printStringNTimes(s, n);
        scanner.close();

        //Implement here

    }

    public static void printStringNTimes(String a, int b) {
        int i = 1;
        while (i <= b) {
            System.out.println(a);
            i++;
        }
    }
}