package exercises;
import java.util.*;
 public class Ex062 {
     // 62. Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others.
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
        in.close();
    }
}