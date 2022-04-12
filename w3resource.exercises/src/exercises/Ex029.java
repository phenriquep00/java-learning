package exercises;

public class Ex029 {
    //29. Write a Java program to convert a hexadecimal to a binary number.
    public static void main(String[] args){
        String myHex = "37";
        int myInt = Integer.parseInt(myHex, 16);
        String myBin = Integer.toBinaryString(myInt);

        System.out.println(myBin);

    }
}
