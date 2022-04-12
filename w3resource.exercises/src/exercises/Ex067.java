package exercises;

public class Ex067 {
    // 67. Write a Java program to insert a word in the middle of the another string.
    // Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
    // Python Tutorial 3.0
    public static void main(String[] args){
        String myStr = "Python 3.0";
        String[] arr = myStr.split(" ");
        System.out.println(myStr);
        myStr = "";
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 1) {
                myStr += " Tutorial ";
            } else {
                myStr += arr[i];
            }
        }
        myStr += "3.0";
        System.out.println(myStr);
    }
}
