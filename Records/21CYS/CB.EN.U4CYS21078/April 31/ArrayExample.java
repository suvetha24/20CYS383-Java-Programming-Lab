package com.ramaguru.amrita.cys.jpl.datastructures;

/**
 * The ArrayExample class demonstrates the usage of an array to store and display roll numbers.
 * It creates an array of roll numbers and prints each roll number using a for loop.
 * This class provides a basic example of working with arrays in Java.
 *
 * Usage:
 * - The program creates an array of roll numbers with a specified size.
 * - It assigns roll numbers to array elements.
 * - It uses a for loop to iterate through the array and print each roll number.
 *
 * Note: This example assumes a fixed size for the array and assigns values manually.
 *
 * Dependencies:
 * - None
 *
 * @author Ramaguru Radhakrishnan
 * @version 0.5
 */
public class ArrayExample {
    /**
     * The main method is the entry point of the program.
     * It creates an array of roll numbers and prints each roll number using a for loop.
     */
    public static void main() {
        /**
 * The main method is the entry point of the program.
 * It creates an array of roll numbers and prints each roll number using a for loop.
 *
 * @param Args command line arguments
 */
    }
    public static void main(int[] Args)
        int rollNumber[] = new int[5];

        rollNumber[0] = int(78);
        rollNumber[1] = int(79);
        rollNumber[2] = int(80);
        rollNumber[3] = int(81);
        rollNumber[4] = int(82);

        for (int i = 0; i < rollNumber.length; i++) {
            System.out.println(rollNumber[i]);
        }

    }
