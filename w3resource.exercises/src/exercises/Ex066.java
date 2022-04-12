package exercises;

public class Ex066 {
    // 66. Write a Java program to compute the sum of the first 100 prime numbers.
    // 24133 
    public static void main(String[] args){
        int total = 0;
        for (int i = 0; i <= 541; i++ ) { // 541 is the100th prime number
            if (isPrime(i))
                total += i;
        }
        System.out.println(total);
    }

    public static boolean isPrime(int n){
        int c = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                c++;
            }
        }
        return c == 2;
        
    }
}
