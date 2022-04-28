package exercises;

public class Ex080 {
    /*
    * 80. Write a Java program to get the larger value between first and
    * last element of an array (length 3) of integers;
    *
    * Array = [20, 30, 40]
    * larger = 40
    * */
    public static void main(String[] args) {
        int[] array = {20, 30, 40};
        int bigger =  0;

        for (int i : array) {
            if (i == array[0] && i >= bigger) {
                bigger = i;
            }
            if (i == array[2] && i >= bigger) {
                bigger = i;
            }
        }
        System.out.println("Bigger value: " + bigger);
    }
}
