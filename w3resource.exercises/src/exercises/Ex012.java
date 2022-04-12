package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex012 {
    //12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double mean = (n1 + n2 + n3) / 3;
        System.out.println(mean);

        scan.close();
    }
}
