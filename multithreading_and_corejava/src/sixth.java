public class sixth {
    public static void main(String[] args) {
    char[] s = new char[]{'a','b','a','b','c','d','d','c','e','h','h'};
    int m = s.length;
    int flag=0;
    int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i != j) {
                    if(s[i]!=s[j]){
                    flag = 1;
                    }
                    else{
                        flag=0;
                        break; }}}
            if (flag == 1){
                count++;
                System.out.println("output is :->  "+s[i]);
            }}}}
