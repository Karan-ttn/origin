/*class A{

}*/

public class ques3 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException c){
            System.out.println("Class Not Found Exception");
        }

       /* exmpl a = new exmpl();
        System.out.println("Example");*/
    }
}


