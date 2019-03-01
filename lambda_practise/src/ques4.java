interface structure{
    Employee emp (String name,Integer age,String city);
}

class Employee{
    String name;
    Integer age;
    String city;
    Employee (String name,Integer age,String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public String toString(){
        String s = " Name is "+this.name+" Age is "+this.age+" City is "+this.city;
        return s;
    }
}

public class ques4 {
    public static void main(String[] args) {
        structure s = Employee::new;
        System.out.println(s.emp("Karan",22,"Kanpur").toString());
        System.out.println(s.emp("Gaurav",20,"Cawnpore").toString());
        System.out.println(s.emp("Kashish",12,"Kanpur").toString());
        System.out.println(s.emp("Shubham",22,"Lucknow").toString());
    }
}
