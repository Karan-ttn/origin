@FunctionalInterface
interface multiply{
    int mul(int a ,int b);
}

public class ques2 {

    static int product(int a , int b){
        int c = a*b;
        return c;
    }

    public static void main(String[] args) {
        multiply m = ques2::product;
        System.out.println(m.mul(2,4));
    }
}
