interface comparison{
    boolean compare(int a ,int b);
}
interface increament{
    void increase(int a);
}
interface concat{
    String conc(String a,String b);
}
interface upper{
    String up(String a);
}
interface return_one_int{
    int ret(int a,int b);
}
public class ques1 {
    public static void main(String[] args) {

        comparison c = (a, b) -> {
            if (a < b) return false;
            else return true;
        };
        System.out.println(c.compare(1, 2));

        increament i = a -> System.out.println(a + 1);
        i.increase(5);

        concat co = (a, b) -> a + b;
        System.out.println(co.conc("Hello ", "World"));

        upper u = a -> a.toUpperCase();
        System.out.println(u.up("Hiii"));

        return_one_int r = (a, b) -> a;
        System.out.println(r.ret(1, 2));
    }
}

