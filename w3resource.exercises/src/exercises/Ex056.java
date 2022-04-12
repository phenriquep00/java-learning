package exercises;

import java.util.Scanner;

public class Ex056 {
    /*
    56. Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number. 
    For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
    Sample Output:
    5
    */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scan.nextInt();
        System.out.print("n2: ");
        int n2 = scan.nextInt();
        System.out.print("divisioner: ");
        int d = scan.nextInt();
        int tot = 0;

        for (int i = n1; i <= n2; i++){
            if (i % d == 0) {
                tot++;
            }
        }

        System.out.println(tot);
        scan.close();
    }
}
