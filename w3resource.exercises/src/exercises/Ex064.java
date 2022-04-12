package exercises;

import java.util.Scanner;
public class Ex064 {
    // 64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("input n1 (75<>25): ");
        int n1 = scan.nextInt();
        while (n1 < 25 || n1 > 75){
            System.out.println("Invalid number!");
            System.out.print("input n1 (75<>25): ");
            n1 = scan.nextInt();
        }
        System.out.print("input n2 (75<>25): ");
        int n2 = scan.nextInt();
        while (n2 < 25 || n2 > 75){
            System.out.println("Invalid number!");
            System.out.print("input n1 (75<>25): ");
            n2 = scan.nextInt();
        }

        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2);
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        
        if (chars1[0] == chars2[0] || chars1[0] == chars2[1] || chars1[1] == chars2[0] || chars1[1] == chars2[1]){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        scan.close();
    }
}
