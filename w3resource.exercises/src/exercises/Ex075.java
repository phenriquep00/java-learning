package exercises;


public class Ex075 {
    //75. Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2.
    public static void main(String[] args) {
        int[] arr = {50, -20, 0, 30, 40, 60, 10};
        System.out.print((arr[0] == arr[arr.length - 1]));
    }    
}
