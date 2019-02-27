import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10.5);
        a.add(1.1);
        a.add(2.2);
        a.add(8.0099);
        a.add(9.0);
        Iterator i = a.iterator();
        double j = 0;
        while(i.hasNext()){
            j = j + (double)i.next() ;
        }
        System.out.println(" Sum of all is "+j);
    }
}
