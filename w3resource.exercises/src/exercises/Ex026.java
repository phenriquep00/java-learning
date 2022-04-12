package exercises;

public class Ex026 {
    //26. Write a Java program to convert a octal number to a binary number.
    public static void main(String[] args){

        String myOct = "7";
        int myInt = Integer.parseInt(myOct, 8);
        String myBin = Integer.toBinaryString(myInt);

        System.out.println(myBin);
    }
}
