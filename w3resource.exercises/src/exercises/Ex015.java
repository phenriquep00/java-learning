package exercises;

public class Ex015 {
    //15. Write a Java program to swap two variables.
    public static void main(String[] args) {
        int a = 3;
        int b = 1;

        int aux = a;
        a = b;
        b = aux;

        System.out.println(a);
        System.out.println(b);
        
    }
}
