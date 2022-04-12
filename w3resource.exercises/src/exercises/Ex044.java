package exercises;

import java.util.Scanner;

public class Ex044 {
    //44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
    /*
    Sample Output:

    Input number: 5                                                        
    5 + 55  + 555
    */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number: ");
        int myInt = scan.nextInt();
        System.out.println(nNnNnn(myInt));

        scan.close();
    }

    public static String nNnNnn(int n){
        
        return Integer.toString(n) + " + "+  Integer.toString(n*11) + " + " + Integer.toString(n*111);
    }
}
