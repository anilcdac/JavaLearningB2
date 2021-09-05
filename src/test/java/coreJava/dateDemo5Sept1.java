package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo5Sept1 {

    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString());

        //Format mm/dd/yyyy HH:MM:SS
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String formatted_date = sdf.format(d);
        System.out.println("Formatted Date: " + formatted_date);

        SimpleDateFormat sdf2 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        String formatted_date2 = sdf2.format(d);
        System.out.println("Formatted Date2: " + formatted_date2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy");
        String formatted_date3 = sdf3.format(d);
        System.out.println("Formatted Date3: " + formatted_date3);

    }


}
