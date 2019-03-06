public class seventh {
    static String fname ;
    static String lname ;
    static int age = 21;

    static {
        fname = "Karan";
        lname = "Sawlani";
    }

    public static void main(String[] args)
    {
        System.out.println(hello());
    }
    public static String hello()
    {
        return(fname+" "+lname+" "+age);
    }
}
