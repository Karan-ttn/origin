import java.lang.*;
public class fourth {
    public static void main(String[] args) {
        int d=0,u=0,l=0,s=0;
        String testString = "Hi HELLO How are you number1 2 and 3 @###$$$!!! ";
        char[] stringToCharArray = testString.toCharArray();
        for (char output : stringToCharArray) {
            if(Character.isDigit(output)) {
                d += 1;
            }
            else if(Character.isUpperCase(output)) {
                u += 1;
            }
            else if(Character.isLowerCase(output)) {
                l += 1;
            }
            else{
                s += 1;
            }
        }System.out.println("digits count :"+d+" uppercase count :"+u+" lowercase count :"+l+" symbols count :"+s);
    }
}


