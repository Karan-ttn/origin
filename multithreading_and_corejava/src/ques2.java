public class ques2 {
   public static void main(String[] args) {
       String s = "helloman";
       String r = "";
       char temp;
       char[] s1 = s.toCharArray();
       int m = s1.length;
       for (int i = 0; i < m; i++) {
           for(int j = 0; j < m;j++){
               if(s1[i]<s1[j]){
                   temp = s1[i];
                   s1[i] = s1[j];
                   s1[j] = temp;
               }
           }
       }
       System.out.println(s1);
   }
}