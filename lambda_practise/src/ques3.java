interface MultiOper{
    int addOrSubOrMult(int a,int b);
}

public class ques3 {

    int add(int a,int b){
        int c = a+b;
        return c;
    }

    static int sub(int a , int b){
        int c = a-b;
        return c;
    }

    public static void main(String[] args) {

        MultiOper m = (a,b)-> a*b;
        System.out.println(m.addOrSubOrMult(2,4));

        MultiOper m1 = new ques3()::add;
        System.out.println(m1.addOrSubOrMult(2,4));

        MultiOper m2 = ques3::sub;
        System.out.println(m2.addOrSubOrMult(2,4));

    }
}
