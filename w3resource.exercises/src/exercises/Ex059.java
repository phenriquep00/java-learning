package exercises;

import java.util.Scanner; 

public class Ex059 {
    // 59. Write a Java program to convert a given string into lowercase.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a uppercase phrase: ");
        String myStr = scan.nextLine();

        String[] array = myStr.split(" ");
        myStr = "";
        for (int i = 0; i < array.length; i++) {
            myStr +=  array[i].toLowerCase() + " ";
        }

        System.out.println(myStr);

        scan.close();

    }
}
