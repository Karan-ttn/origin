import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ques11 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,1,1,5,6,4,5,9,9);

        //List<Integer> l = Arrays.asList(); -> for null value in any array

        OptionalDouble o = l.stream().map(e->e*2).mapToInt(e->e).average();

        if(o.isPresent()){
            System.out.println(o.getAsDouble());
        }else{
            System.out.println("handled null values if any for average");
        }
    }
}
