package exercises;

public class Ex050 {
    //50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
    public static void main(String[] args){
        System.out.print("Divisible by 3: ");
        for (int i = 1; i < 100; i++){
            if (i % 3 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.print("\n\n");
        System.out.print("Divisible by 5: ");
        for (int i = 1; i < 100; i++){
            if (i % 5 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.print("\n\n");
        System.out.print("Divisible by 3 and 5: ");
        for (int i = 1; i < 100; i++){
            if (i % 5 == 0 && i % 3 ==0){
                System.out.print(i + ", ");
            }
        }
    }
}
