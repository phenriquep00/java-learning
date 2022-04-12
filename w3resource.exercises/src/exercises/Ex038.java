package exercises;

import java.util.Scanner;

public class Ex038 {
    // Write a Java program to count the letters, spaces, numbers and other characters of an input string.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("String: ");
        String myStr = scan.nextLine();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for(int i=0; i< myStr.length(); i++){
            Character ch = myStr.charAt(i);
            if(Character.isLetter(ch)){
                letters++;
            } else if(Character.isSpaceChar(ch)){
                spaces++;
            } else if(Character.isDigit(ch)){
                numbers++;
            } else{
                others++;
            }
        }

        System.out.println("Letterrs: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Others: " + others);

        scan.close();

    }
}
