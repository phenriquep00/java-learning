package exercises;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex047 {
    //47. Write a Java program to display the current date time in specific format.
    //Now: 2017/06/16 08:52:03.066
    public static void main(String[] args){
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dataFormat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("BRT")));

        System.out.println("Now: " + dataFormat.format(System.currentTimeMillis()));
    }
}
