import java.util.*;


public class ques2 {
    public static void main(String[] args) {
        String s = "HellomanHello";
        List<String> l = Arrays.asList(s.split(""));
        System.out.println(" list of all ---   >>>   "+l);
        Set<String> se = new HashSet<String>(l);
        Iterator i = se.iterator();
        System.out.println(" list of uniques ---   >>>  "+se);
        int j = 0;
        while(i.hasNext()) {
            i.next();
             j = j+1;
        }
        System.out.println(" count of uniques ---   >>>  "+j);
    }
}
