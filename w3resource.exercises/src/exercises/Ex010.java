package exercises;

import java.util.Scanner;

public class Ex010 {
    //11. Write a Java program to print the area and perimeter of a circle.

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("radius: ");
        double radius = scan.nextDouble();
        final double PI = 3.14;
        double circunference = 2 * PI * radius;
        System.out.println(circunference);
        double area = PI * (radius * radius);
        System.out.println(area);

        scan.close();
    }
}
