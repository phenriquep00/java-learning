package exercises;

public class Ex023 {
    //23. Write a Java program to convert a binary number to hexadecimal number.
    public static void main(String[] args){
        String myBin = "1101";
        
        int myInt = Integer.parseInt(myBin, 2);

        String myHex = Integer.toHexString(myInt);

        System.out.println(myHex);
    }
}
