package exercises;


import java.lang.reflect.Array;

public class Ex074 {
    // 74. Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.
    public static void main(String[] args){
        int[] arr = {10, -20, 0, 30, 40, 60, 10};

        boolean answer = (arr[0] == 10 || arr[-1] == 10) ? true : false;

        System.out.print(answer);

    }
}
