public class ques6 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic error");
        }
        catch(StringIndexOutOfBoundsException v){
            System.out.println("String out of bound error");
        }
        catch(Exception e){
            System.out.println("Other Exception");
        }
        finally {
            System.out.println("Final aways executes");
        }
    }
}
