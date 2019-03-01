import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ques12 {
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1,2,2,1,4,4,5,6,7,8,9,1,1,5,6,4,5,9,9);

        System.out.println(l.stream().
                filter(e->{
                    System.out.println(" greater than 3 check "+e);
                    return e>3;
                }).
                filter(e->{
                    System.out.println(" even check "+e);
                    return e%2==0;
                }).
                findFirst().
                orElse(-100000000));
        System.out.println(" Concept of Lazy Evaluation Illustrated Above ");
    }
}
