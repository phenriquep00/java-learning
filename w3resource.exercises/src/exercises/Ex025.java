package exercises;

public class Ex025 {
    //25. Write a Java program to convert a octal number to a decimal number.
    public static void main(String[] args){
        String myOct = "1023";
        int myInt = Integer.parseInt(myOct, 8);

        System.out.println(myInt);
    }
}
