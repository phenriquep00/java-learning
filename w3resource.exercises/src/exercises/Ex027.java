package exercises;

public class Ex027 {
    //27. Write a Java program to convert a octal number to a hexadecimal number.
    public static void main(String[] args){

        String myOct = "100";
        int myInt = Integer.parseInt(myOct, 8);
        String myHex = Integer.toHexString(myInt);

        System.out.println(myHex);
    }
}
