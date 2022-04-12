package exercises;

import java.util.Scanner;

public class Ex034 {
    //34. Write a Java program to compute the area of a hexagon.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("length of the side of the hexagon: ");
        double s = scan.nextDouble();
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        
        System.out.println(area);

        scan.close();
    }
}
