package exercises;

import java.util.Scanner;

public class Ex065 {
    // 65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("input 1° number: ");
        int n1 = scan.nextInt();
        System.out.print("input 2° number: ");
        int n2 = scan.nextInt();
        int divided = n1 / n2;
		int result = n1 - (divided * n2);
		System.out.println(result); 
        scan.close();
    }
}
