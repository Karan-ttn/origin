import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ques5 {
    public static void main(String[] args) {

        int b = 6;

        Consumer c = a-> { System.out.println((int)a+b);};
        c.accept(7);

        Supplier s = ()-> " Hello World ! "+b;
        System.out.println(s.get());

        Predicate p = a->(int)a>7;
        System.out.println(p.test(b));

        Function f = a->(int)a*b;
        System.out.println(f.apply(8));

    }
}
