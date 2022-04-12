package exercises;

import java.util.Scanner;

public class Ex036 {
    //36. Write a Java program to compute the distance between two points on the surface of earth.
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        double latitude1 = scan.nextDouble();
        double latitude2 = scan.nextDouble();
        double longitude1 = scan.nextDouble();
        double longitude2 = scan.nextDouble();

        System.out.println("Distance is: " + distanceTwoPoints(latitude1, latitude2, longitude1, longitude2) + "km");

        scan.close();

    }

    public static Double distanceTwoPoints(double la1, double la2, double lo1, double lo2){
        la1 = Math.toRadians(la1);
        la2 = Math.toRadians(la2);
        lo1 = Math.toRadians(lo1);
        lo2 = Math.toRadians(lo2);

        return 6371.01 * Math.acos(Math.sin(la1) * Math.sin(la2) + Math.cos(la1) * Math.cos(la2) * Math.cos(lo1 - lo2));
    }
}
