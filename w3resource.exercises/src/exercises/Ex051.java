package exercises;

import java.util.Scanner;

public class Ex051 {
    //51. Write a Java program to convert a string to an integer in Java.
    /*
    Sample Output:

    Input a number(string): 25                                             
    The integer value is: 25
    */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String myStr = scan.nextLine();
        int myInt = Integer.parseInt(myStr);

        System.out.println("The integer value is: "+ myInt);

        scan.close();
        
    }
}
