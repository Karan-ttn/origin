import java.util.*;

public class ques3 {
    //private static final Object String = ;

    public static void main(String[] args) {
        String s = "Hello Man How Are You how";
        //String s = "HellooooH";
        List<String> l = Arrays.asList(s.split(""));
        Set<String> se = new HashSet<String>(l);
        Iterator i = se.iterator();
        while(i.hasNext()){
            String k = (String) i.next();
            int temp= (int) Collections.frequency(l,k);
            System.out.println(" Letter "+k+" count "+temp);
        }
        }
    }

