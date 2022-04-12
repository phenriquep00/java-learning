package exercises;

import java.util.Scanner;

public class Ex055 {
    //55. Write a Java program to convert seconds to hour, minute and seconds.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("seconds: ");
        double seconds = scan.nextDouble();
        double hours = seconds / 3600;
        seconds %= 3600;
        double minutes = seconds / 60;
        seconds %= 60;

        System.out.println((int)hours + ":" + (int)minutes + ":" + (int)seconds);


        scan.close();
    }
}
