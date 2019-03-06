abstract public class ques9 {
    public abstract void fire_test();
    public abstract void stress_test();
}
class wooden_chair_table extends ques9 {
    public void fire_test() {
        System.out.println("Fire test Done successfully for wooden_chair and wooden_table");
    }
    public void stress_test() {
        System.out.println("Stress test Done successfully for wooden_chair and wooden_table");
    }
}
class metal_chair_table extends ques9 {
    public void fire_test() {
        System.out.println("Fire test Done successfully for metal_chair and metal_table");
    }
    public void stress_test() {
        System.out.println("Stress test Done successfully for Metal_chair and metal_table");
    }
}
class call{
public static void main(String[] args) {
    wooden_chair_table wct = new wooden_chair_table();
    metal_chair_table mct = new metal_chair_table();
    wct.fire_test();
    wct.stress_test();
    mct.fire_test();
    mct.stress_test();
}
}

