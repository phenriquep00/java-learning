package exercises;

public class Ex022 {
    //22. Write a Java program to convert a binary number to decimal number.

    public static void main(String[] args){
        String myBin = "100";
        
        int myInt = Integer.parseInt(myBin, 2);

        System.out.println(myInt);
    }
}
