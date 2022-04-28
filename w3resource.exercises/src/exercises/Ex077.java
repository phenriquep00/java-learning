package exercises;

import java.util.Arrays;

public class Ex077 {
    /*
    * 77. Write a Java program to create a new array
    * of length 2 from two arrays os integers with three
    * elements and the new array will contain the first
    * and lat element from the two arrays.
    *
    * Test Data: array1 = 50, -20, 0;
    * array2 = 5, -50, 10;
    *
    * array3 = [50, 10]
    * */
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};

        int[] newArray = {array1[0], array2[array2.length - 1]};

        System.out.println(Arrays.toString(newArray));
    }
}
