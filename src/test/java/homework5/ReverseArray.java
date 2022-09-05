package homework5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    /*
    1. Create an Array, of 10 String elements
    2. Input from the console 8 Strings and save them to the array
    3. Print to the console (10 elements) in reverse order. Each element from new line
     */
    public static void main(String[] args) {

        String[] array = new String[10];
        System.out.println("Enter 8 Strings:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextLine();
        };
        Arrays.sort(array, Collections.reverseOrder());

        System.out.println(Arrays.toString(array)+ "\n");

        //implement me
    }
}