@FunctionalInterface
interface test{
    void check();

    default void check1() {
        System.out.println("Hello default check of interface");
    }

    static void check2(){
        System.out.println("Hello static check of interface");
    }
}

public class ques6 {
    public static void main(String[] args) {

        test t = ()->{ System.out.println("Hello check of interface"); };
        t.check();

        test t1 = ()-> {};
        t1.check1();

        test.check2();
    }
}
