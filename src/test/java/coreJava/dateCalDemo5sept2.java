package coreJava;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class dateCalDemo5sept2 {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        //cal.getTime();

        System.out.println(" Calender formatted_date: " + sd.format(cal.getTime()));

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        //Getting the current date value
        LocalDate currentdate = LocalDate.now();
        System.out.println("Current Date" + currentdate);

        //Getting the current day
        int currentday = currentdate.getDayOfMonth();
        System.out.println("Current day: " + currentday);
        //Getting the current month
        Month currentmonth =  currentdate.getMonth();
        System.out.println("Current Month:" + currentmonth);
        //getting the current year
        int currentyear = currentdate.getYear();
        System.out.println("Current Year:" + currentyear);

        boolean isleapyear = currentdate.isLeapYear();
        System.out.println("Is Leap Year:" + isleapyear);


        if (isleapyear == true)
        {
            System.out.println("This year is leap year");
        }
        else{
            System.out.println("This year is not leap year");

        }

        //operators
        // + , - , a =  5 ;  a == 6




    }

}
