import java.util.Arrays;
import java.util.List;

public class ques10 {
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,1,1,5,6,4,5,9,9);

        System.out.println(l.stream().
                filter(e->e>5).
                mapToInt(e->e).
                sum());
    }
}
