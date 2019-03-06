public class ques1 {
    public static void main(String[] args) {
        library_details l = new library_details();
        l.student_info("Karan",1,22);
        l.borrow(20);
    }
}
abstract class library_structure{
    static int book_id;
    abstract public void student_info(String sname,int id,int age);
    public void borrow(int book_id){
        this.book_id=book_id;
    }
}
class library_details extends library_structure{
    String sname;
    int id;
    int age;

    @Override
    public void student_info(String sname, int id, int age) {
        this.age = age;
        this.id = id;
        this.sname = sname;
    }
    public void borrow(int book_id){
        super.borrow(book_id);
        System.out.println("book_id "+book_id+" is issued to "+sname);
    }
}