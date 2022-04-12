package exercises;


public class Ex071 {
    //71. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Tutorial";

        System.out.println(str1.substring(1) + str2.substring(1));
        /*
        * The String class method .substring() can be used to get
        * the substring from an original string
        * */
    }
}
