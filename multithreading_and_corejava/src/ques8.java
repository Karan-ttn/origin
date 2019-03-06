import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        String s="";
        System.out.println("Enter text till you want and type 'done' to come out");
        Scanner sc = new Scanner(System.in);
        while(!s.equals("done")){
            s = sc.next();
            char[] arr = s.toCharArray();
            if (arr[0] == arr[arr.length-1]){
                System.out.println("Repeated First And Last Letter for "+s);
            }
            else{
                System.out.println("Not Repeated First And Last Letter for "+s);
            }
        }
    }
}
