import java.util.*;

public class ques7 {
    static Integer high = Integer.MAX_VALUE;
    static Integer size = 10;
    static LinkedList<Integer> perm = new LinkedList<Integer>();
    static LinkedList<Integer> temp = new LinkedList<Integer>();

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ques7 o = new ques7();
        System.out.println();
        o.push_elements();
        System.out.println();
        o.get_min();
        System.out.println();
        o.pop_elements();
        System.out.println();
        o.checkForEmpty();
    }

    void push_elements() {
        System.out.println(" Enter no. of elements to be pushed");
        int j = sc.nextInt();
        if (checkForFull(j)) {
            for (int i = 0; i < j; i++) {
                System.out.println(" Push elements ");
                int val = sc.nextInt();
                if (val < high) {
                    high = val;
                } else {
                    high = high;
                }
                perm.push(val);
                temp.push(high);
            }
        }
        else{
            System.out.println(" Enter less number of items to push ");
        }
    }

    void pop_elements() {
        System.out.println(" Enter no. of elements to pop ");
        int j = sc.nextInt();
        if (checkForFull(j)) {
            for (int i = 0; i < j; i++) {
                System.out.println(" Pop elements by index ");
                int val = sc.nextInt();
                perm.pop();
                System.out.println(perm);
            }
        }
        else{
            System.out.println(" Enter less number of items to pop ");
        }
    }

    void get_min(){
        System.out.println(" Minimum value is ");
        System.out.println(temp.get(0));
    }

    void checkForEmpty(){
        if(perm.isEmpty()){
            System.out.println("Stack is emptied");
        }
        else{
            System.out.println(" Above elements are remaining one ");
        }
    }
    boolean checkForFull(int j){
        if(j >= size){
            System.out.println(" Stack is  Full ");
            return false;
        }
        else{
            return true;
        }
    }
}


