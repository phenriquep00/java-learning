package exercises;

public class Ex004 {
    /*4. Write a Java program to print the result of the following operations.
    Test Data:
    a. -5 + 8 * 6
    b. (55+9) % 9
    c. 20 + -3*5 / 8
    d. 5 + 15 / 3 * 2 - 8 % 3
    Expected Output :
    43
    1
    19
    13
    */
    public static void main(String[] args){
        int sum = -5 + 8 * 6;
        System.out.println("a. -5 + 8 * 6 = " + sum);
        sum = (55+9) % 9;
        System.out.println("b. (55 + 9) % 9 = " + sum);
        sum = 20 + -3*5/8;
        System.out.println("c. 20 + -3 * 5 / 8 = " + sum);
        sum = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3 = " + sum);
    }

}
