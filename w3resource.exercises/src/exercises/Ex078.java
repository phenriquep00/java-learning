package exercises;

public class Ex078 {
    /*
    * 78. Write a Java program to test that a given array of integers of length
    * 2 contains a 4 or a 7.
    *
    * */
    public static void main(String[] args) {
        int[] array = {5, 4};
        boolean result = false;
        for (int i : array) {
            if (i == 4 || i == 7){
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
