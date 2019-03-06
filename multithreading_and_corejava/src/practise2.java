import java.util.*;

public class practise2 {
    /*public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        Iterator i = a.iterator();
        *//*while(i.hasNext()){
            System.out.println(i.next());
            a.add(100);
        }*//*
        ListIterator l = a.listIterator();
        while(l.hasNext()){
            System.out.println(l.next());
            l.add(1000);
        }

        *//*LinkedList <String> ll = new LinkedList();
        ll.addFirst();*//*

    }*/

    public static void main(String[] args) {
        person p = new person("Karan",21);
        employee e1 = new employee("Hi",20,3333);
        employee e2 = new employee("Higuys",21,3332);
        ArrayList a = new ArrayList();
        a.add(e1);
        a.add(e2);
        Iterator i = a.iterator();
            while(i.hasNext()){
                employee t = (employee)i.next();
                System.out.println(t.age+" "+t.id+" "+t.name);
            }
        //System.out.println(a);
    }
}

class person{
    String name;
    int age;

     person(String name,int  age){
        this.name = name;
        this.age = age;
    }
}

class employee extends person{
    int id;
    employee(String name,int age,int id){
        super(name,age);
        this.id = id;
    }
}

