package exercises;

import java.io.File;

public class Ex045 {
    //45. Write a Java program to find the size of a specified file.
    public static void main(String[] args){
        System.out.println(System.getProperty("user.dir") + "\\abc.txt: " + new File("abc.txt").length() + "bytes");
    }
}
