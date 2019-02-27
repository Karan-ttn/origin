import java.text.SimpleDateFormat;
import java.util.Date;

public class ques8 {
    public static void main(String[] args) {
        Date x = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(" MM/dd/yyyy ");
        String format_change = formatter.format(x);
        System.out.println(format_change);
        formatter = new SimpleDateFormat("dd-MMM-yyyy");
        format_change = formatter.format(x);
        System.out.println(" Format changed with dd-MM-yyyy : "+format_change);
    }
}
