import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ques9 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Today is "+d);
        Locale l1 =new Locale("English","IN");
        //Locale l3 = new Locale("cs","FR");
        Locale l2 = new Locale("it","ch");

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,l1);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,l2);
        //DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,l3);

        System.out.println("FOR INDIA Today is "+df1.format(d));
        //System.out.println("Today is "+df3.format(d));
        System.out.println("FOR SWITZERLAND Today is "+df2.format(d));
    }
}
