public class tenth {
    public int add(int m,int n){
       int c = m+n;
        System.out.println("int add");
       return c;
    }
    public double add(double m, double n){
        double c = m+n;
        System.out.println("float add");
        return c;
    }
    public int mult(int m,int n){
        int c = m*n;
        System.out.println("int mul");
        return c;
    }
    public double mult(double m,double n){
        double c = m*n;
        System.out.println("float mul");
        return c;
    }
    public String conc(String m,String n){
        String c = m+n;
        return c;
    }
    public String conc(String m,String n,String o){
        String c = m+n+o;
        return c;
    }
    public static void main(String[] args) {
        tenth t = new tenth();
        System.out.println(t.add(1.0,2));
        System.out.println();
        System.out.println(t.mult(1,2));
        System.out.println();
        System.out.println(t.conc("Hello","Hi"));
        System.out.println();
        System.out.println(t.conc("Hello","Hi","How"));
    }
}
