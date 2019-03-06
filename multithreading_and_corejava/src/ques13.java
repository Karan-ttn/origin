public class ques13 {
    int bal = 10000;
    void withdraw(int w) throws customException {
        if(bal > w){
            System.out.println("Amount left is "+(bal-w));
        }
        else{
            throw new customException("h");
        }
    }

    public static void main(String[] args) {
        ques13 x = new ques13();
        try{
        x.withdraw(100000);
    }
    catch(Exception e){
        //System.out.println("check");
    }
    }
}

class customException extends Exception{
    customException(String m){
        System.out.println(m);
    }
}