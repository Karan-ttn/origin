class StudentBuilder {
    String fname;
    String lname;
    int roll_no;
    String department;
    boolean ispass;
    int total_marks;

    public StudentBuilder(String fname,int roll_no){
        this.fname = fname;
        this.roll_no = roll_no;
    }

    public String getFname() {
        return fname;
    }

    public StudentBuilder setFname(String fname) {
        this.fname = fname;
        return this;
    }

    public String getLname() {
        return lname;
    }

    public StudentBuilder setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public StudentBuilder setRoll_no(int roll_no) {
        this.roll_no = roll_no;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public StudentBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public boolean isIspass() {
        return ispass;
    }

    public StudentBuilder wasIspass(boolean ispass) {
        this.ispass = ispass;
        return this;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public StudentBuilder setTotal_marks(int total_marks) {
        this.total_marks = total_marks;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}

class Student{
    String fname;
    String lname;
    int roll_no;
    String department;
    boolean ispass;
    int total_marks;

    public Student(StudentBuilder sb){
        this.fname = sb.fname;
        this.lname = sb.lname;
        this.roll_no = sb.roll_no;
        this.department = sb.department;
        this.ispass = sb.ispass;
        this.total_marks = sb.total_marks;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isIspass() {
        return ispass;
    }

    public void setIspass(boolean ispass) {
        this.ispass = ispass;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(int total_marks) {
        this.total_marks = total_marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", roll_no=" + roll_no +
                ", department='" + department + '\'' +
                ", ispass=" + ispass +
                ", total_marks=" + total_marks +
                '}';
    }
}

public class ques4 {
    public static void main(String[] args) {
        Student s = new StudentBuilder("Karan",1234).
                setLname("Sawlani").
                setTotal_marks(24).
                setDepartment("CSE").
                wasIspass(true).build();
        System.out.println(s);
    }
}
