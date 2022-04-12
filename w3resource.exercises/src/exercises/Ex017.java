package exercises;


public class Ex017 {
    //17. Write a Java program to add two binary numbers.

    public static void main(String[] args){
        int bin1 = 0b10;
        int bin2 = 0b11;

        int sum = bin1 + bin2;

        String result = Integer.toBinaryString(sum);

        System.out.println(result);
    }
}
