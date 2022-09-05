package homework5;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

        class TwoArrays {
            public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                String[] stringArray = new String[10];
                int[] intArray = new int[10];


                for (int i = 0; i < intArray.length; i++) {
                    stringArray[i] = reader.readLine();
                }

                for (int i = 0; i < intArray.length; i++) {
                    intArray[i] = stringArray[i].length();
                }

                for (int i = 0; i < intArray.length; i++) {
                    System.out.println(intArray[i]);
                }
            }
        }