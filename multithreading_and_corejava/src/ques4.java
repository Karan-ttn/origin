public class ques4 {
    static ques4 abc = new ques4();
    private ques4(){}
    public static ques4 getInstance(){
        return abc;
    }
}

class Singleton{
    public static void main(String[] args) {
        ques4 q = ques4.getInstance();
    }
}