package GeeksForGeeks;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class JavaDateAndDay {


    public static void main(String[] args) throws ParseException {
        FastReader fs = new FastReader();
        int t = fs.nextInt();

        while(t-- > 0){
            String strDate = fs.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date date = format.parse(strDate);
            DateFormat format2=new SimpleDateFormat("EEEE");
            String finalDay=format2.format(date);
            System.out.println(finalDay.toUpperCase());
        }
    }
}
