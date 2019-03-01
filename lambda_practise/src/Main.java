interface add_sub{
    int asb(int a,int b);
}

public class Main {
    public static int addOrsub(int a, int b){
        int d = a-b;
        return d;
    }

    public static void main(String[] args) {

        add_sub as = Main::addOrsub;
        System.out.println(as.asb(1,4));

    }
}
