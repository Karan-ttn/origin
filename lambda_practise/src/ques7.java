interface override{
    default void display(){
        System.out.println(" Default Method Of Interface ");
    }
}

public class ques7 implements override{

     public void display(){
        System.out.println(" Overriding Default Method Of Interface ");
    }

    public static void main(String[] args) {
       ques7 q = new ques7();
       q.display();
    }
}
