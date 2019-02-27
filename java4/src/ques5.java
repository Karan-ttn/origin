import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        sorting_class sc = new sorting_class();
        Student st1 = new Student("Karan",25,12);
        Student st2 = new Student("Abhiskek",18,15);
        Student st3 = new Student("Aman",18,11);
        Student st4 = new Student("Aviral",24,22);
        Student st5 = new Student("Saurabh",24,22);
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);
        arr.add(st4);
        arr.add(st5);
        arr.sort(sc);
        Iterator i = arr.iterator();
        while(i.hasNext()){
            Student j = (Student) i.next();
            System.out.println(" Age "+j.age+" Score "+j.score+" Name "+j.name);
        }
    }
}

class sorting_class implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.score > o2.score){
            return -1;
        }
        else if(o1.score < o2.score){
            return 1;
        }
        else{
            if(o1.name.compareTo(o2.name)>0){
                return 1;
            }
            else{
                return -1;
            }
        }
    }
}


class Student{
    String name;
    double score;
    double age;
    Student(String name,double score,double age){
        this.age = age;
        this.name = name;
        this.score = score;
    }
}
