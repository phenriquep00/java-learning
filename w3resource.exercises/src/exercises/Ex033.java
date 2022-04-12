package exercises;

import java.util.Scanner;

public class Ex033 {
    //33. Write a Java program and compute the sum of the digits of an integer.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int myInt = scan.nextInt();
        String myStr = Integer.toString(myInt);
        String[] arr = myStr.split("");
        int res = 0;
        for(int c = 0; c < arr.length; c++){
            res += Integer.parseInt(arr[c]);
        }

        System.out.println(res);

        scan.close();
    }
}
