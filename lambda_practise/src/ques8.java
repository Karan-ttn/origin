interface parent{
    default void display(){
        System.out.println(" Parent default ");
    };
}

interface child1 extends parent{
    default void display(){
        System.out.println(" Child1 default ");
    }
}

interface child2 extends parent{
    default void display(){
        System.out.println(" Child2 default ");
    }
}

public class ques8 implements child1,child2{
     public void display(){
        System.out.println(" Default method ");
    }
    public static void main(String[] args) {
        ques8 q = new ques8();
        q.display();
    }
}
