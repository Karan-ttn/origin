import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ques9 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(" Full list ");
        l.forEach(e-> System.out.println(e));

        System.out.println(" output after filtering ");

        System.out.println(l.stream().
                filter(a->a%2==0).
                collect(Collectors.toList())
        );
    }
}
