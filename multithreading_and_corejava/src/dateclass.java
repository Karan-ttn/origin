import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class dateclass {
    public static void main(String[] args) throws ParseException {
        String input = "22/10/2017 3:40:50";
        //System.out.println(d);
        SimpleDateFormat input_f = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        SimpleDateFormat output_f = new SimpleDateFormat("dd-yyyy-MM hh:mm:ss");
        Date date = null;

        date = input_f.parse(input);
        String input1 = output_f.format(input);
        System.out.println(input1);

    }

}
