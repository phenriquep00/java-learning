package exercises;

import java.nio.charset.Charset;

public class Ex040 {
    //40. Write a Java program to list the available character sets in charset objects.
    public static void main(String[] args){
        System.out.println("List of avaliable char sets: ");
        for (String str : Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
