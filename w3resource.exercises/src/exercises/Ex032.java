package exercises;

import java.util.Scanner;

public class Ex032 {
    //32. Write a Java program to compare two numbers.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        if(n1 != n2){
            System.out.println(n1 + " != " + n2);
        }

        if(n1 > n2){
            System.out.println(n1 + " > " + n2);
            if(n1 >= n2){
                System.out.println(n1 + " >= " + n2);
            }
        } else if(n2 > n1){
            System.out.println(n1 + " < " + n2);
            if(n1 <= n2){
                System.out.println(n1 + " <= " + n2);
            }
        }

        scan.close();
    }
}
