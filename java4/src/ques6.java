import java.util.*;

public class ques6 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you wish to enter");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number");
            l.add(sc.nextInt());
        }
        Map<Integer,Integer> m = new LinkedHashMap<Integer, Integer>();
        for (Integer i : l){
            if (m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        System.out.println(" Before listing "+m);
        List<Map.Entry<Integer,Integer>> lm = new ArrayList<Map.Entry<Integer, Integer>>(m.entrySet());
        System.out.println(" Before comparison "+lm);
        Collections.sort(lm, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(" Final sorted output"+lm);
    }
}




/*        Set s = new LinkedHashSet(l);
        System.out.println(l);
        System.out.println(s);
        Iterator i = s.iterator();
        while(i.hasNext()){
            String  h = (String) i.next();
            int j = Collections.frequency(l,h);
            System.out.println(" Letter "+h+" count "+j);
        }*/

