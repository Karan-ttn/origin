public class ques5 {
    public static void main(String[] args) {
        copyConstructors obj1 = new copyConstructors();
        obj1.j = 10;
        obj1.k = 20;
        copyConstructors obj2 = obj1;
        System.out.println("This is a shallo copy Constructor : "+" The value of j : "+obj2.j+" The value of k : "+obj2.k);

        copyConstructors obj3 = new copyConstructors();
        obj3.j = 10;
        obj3.k = 20;
        System.out.println("This is a deep copy Constructor : "+" The value of j : "+obj3.j+" The value of k : "+obj3.k);

    }
    }
class copyConstructors {
    int j;
    int k;
}

/*
class A implements Cloneable{
    int m,n;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
}
}
*/