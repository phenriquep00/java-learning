package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex079 {
    /*
    * 79. Write a Java program to rotate an array (length 3) of integers in
    * left direction
    *
    * Original Array: [20, 30, 40]
    * Rotated Array: [30, 40, 20]
    * */
    public static void main(String[] args) {
        int[] array_nums = {20, 30, 40};
        int[] rotatedArray = {array_nums[1], array_nums[2], array_nums[0]};

        System.out.println(Arrays.toString(rotatedArray));
    }
}
