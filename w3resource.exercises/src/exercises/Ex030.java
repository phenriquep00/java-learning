package exercises;

public class Ex030 {
    //30. Write a Java program to convert a hexadecimal to a octal number.
    public static void main(String[] args){
        String myHex = "40";
        int myInt = Integer.parseInt(myHex, 16);
        String myOct = Integer.toOctalString(myInt);

        System.out.println(myOct);

    }
}
