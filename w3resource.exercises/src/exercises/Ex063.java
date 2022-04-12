package exercises;

import java.util.Scanner;
public class Ex063 {
    // 63. Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("input the first number: ");
        int n1 = scan.nextInt();
        System.out.print("input the second number: ");
        int n2 = scan.nextInt();
        if (n1 == n2) {
            System.out.println("0");
            
        } else if (n1 > n2){
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
            
        
        scan.close();
    }
}
