package exercises;

public class Ex076 {
    /*
    *  76. Write a Java program to test an
    *  element of two array of integers are same.
    * The length of the array must be greater or equal to 2.
    * Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
    * array2 = 45, 20, 10, 20, 30, 50, 11
    * */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 10, 11, 12};

        boolean result = false;

        for (int i : array1) {
            for (int c : array2) {
                if (c == i) {
                    result = true;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
