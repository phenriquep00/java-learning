package exercises;

public class Ex028 {
    //28. Write a Java program to convert a hexadecimal to a decimal number.
    public static void main(String[] args){
        String myHex = "25";
        int myInt = Integer.parseInt(myHex, 16);

        System.out.println(myInt);

    }
}
