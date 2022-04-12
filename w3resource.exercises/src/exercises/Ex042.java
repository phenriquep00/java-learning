package exercises;

import java.io.Console;

public class Ex042 {
    //42. Write a Java program to input and display your password.
    public static void main(String[] args){
        Console cons;
        if((cons = System.console()) != null){
            char[] password = null;
            try {
                password = cons.readPassword("Input your password: ");
                System.out.println("Your password was: " + new String(password));
            } finally{
                if (password != null){
                    java.util.Arrays.fill(password, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get any password right now");
        }
    }
}
