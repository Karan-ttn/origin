
public class Main {

    /*    public static String  OccurencesOfCharacters(String m,String n){

        int j = m.length();
        int k = m.replace("e","").length();
        int diff = j - k;
        return("length of occurences of e is : "+diff);
    }

    public static void main(String[] args) {
        String s ="Checking the occurences of e in this eeeeee";
        String g = "e";
        System.out.println(OccurencesOfCharacters(s,g));
        fourth h = new fourth();
    }*/
    public static void main(String[] args) {

        int s = 0;
        int t = 1;
        int j;
        int i=0;
        while(i<10){
            s = s+i;
            j=i;
            while(j>0){
                t=t*(j-i);
                j--;
            }
            i++;
            s=s*t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);
    }
}













/*
        for (int i = 0; i < 10; i++) {
            s = s + i;
            for (j = i; j > 0; j =j-1)
            {
                t = t * (j - i);
            }
            s = s * t;
            System.out.println("T is " + t);
        }
        System.out.println("S is " + s);
*/
































