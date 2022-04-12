package exercises;

import java.util.Scanner;

public class Ex049 {
    //49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int myInt = scan.nextInt();
        System.out.println(evenOdd(myInt));
        
        scan.close();
    }

    public static int evenOdd(int n) {
        int res;
        if(n % 2 ==0){
            res = 1;
        } else {
            res = 0;
        }
        
        return res;
    }
}
