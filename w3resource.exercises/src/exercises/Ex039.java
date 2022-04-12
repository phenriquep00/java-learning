package exercises;

public class Ex039 {
    //39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
    public static void main(String[] args){
        int total = 0;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                for(int k=1; k<=4; k++){
                    if(k != i && k != j && j != i){
                        total++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total of numbers = " + total);
    }
}
