import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        Employee e1 = new Employee(21,3330,"Karan");
        Employee e2 = new Employee(22,2345,"Karan2");
        Employee e3 = new Employee(27,2678,"Karan1");
        Employee e4 = new Employee(29,3977,"Karan3");
        sorting s = new sorting();
        ArrayList<Employee> a = new ArrayList<Employee>();
        a.add(e1);
        a.add(e2);
        a.add(e3);
        a.add(e4);
        a.sort(s);
        /*for (Employee j:a){
            System.out.println(" Age "+j.age+" Salary "+j.salary+" Name "+j.name);
        }*/
       Iterator i = a.iterator();
        while(i.hasNext()){
            Employee j = (Employee) i.next();
            System.out.println(" Age "+j.age+" Salary "+j.salary+" Name "+j.name);
        }
    }
}

class Employee {
    double age;
    double salary;
    String name;
    Employee(double age,double salary,String name){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
}

class sorting implements Comparator<Employee>{
    @Override
    public int compare(Employee x, Employee y) {
        int s = (int) (x.salary - y.salary);
        if (s>0){
            return -1;
        }
        else if (s<0){
            return 1;
        }
        else{
            return 0;
        }
    }
}