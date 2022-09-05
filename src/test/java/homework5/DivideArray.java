package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class DivideArray {
    /*
    1. Create an int Array, size 20
    2. Read numbers from the console and fill in this Array
    3. Create 2 int Arrays, size 10 each
    4. Copy big array into 2 small. First half to the first Array, Second half to the second Array
    5. Print second small array to the console
     */

    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter twenty number:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] arrayX = new int[10];
        int[] arrayY = new int[10];
        arrayX = Arrays.copyOfRange(array, 0, 9);
        arrayY = Arrays.copyOfRange(array, 10, 19);

        System.out.println(Arrays.toString(arrayX));
    }
}