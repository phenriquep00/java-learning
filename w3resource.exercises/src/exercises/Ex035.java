package exercises;

import java.util.Scanner;

public class Ex035 {
    //35. Write a Java program to compute the area of a polygon.
    public static void main(String[] args){
        //Area of a polygon = (n*s^2)/(4*tan(π/n))
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of sides: ");
        double n = scan.nextDouble();
        System.out.print("Side length: ");
        double l = scan.nextDouble();

        System.out.println("The polygon's area is: " + polygonArea(n, l));
        scan.close();
    }
    
    public static Double polygonArea(double n, double l){
        return (n*Math.pow(l,2))/(4*Math.tan(Math.PI/n));
    }

}
