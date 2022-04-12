package exercises;

public class Ex024 {
    //24. Write a Java program to convert a binary number to a Octal number.
    public static void main(String[] args){
        String myBin = "111";
        
        int myInt = Integer.parseInt(myBin, 2);

        String myOctal = Integer.toOctalString(myInt);

        System.out.println(myOctal);
    }
}
