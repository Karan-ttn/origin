public class fifth {
    public static void main(String[] args) {
        char[] carray = new char[]{'q', 'w', 'e', 'b'};
        char[] barray = new char[]{'a', 'c', 'w', 'e', 'q', 'd'};
        int b = barray.length;
        int c = carray.length;
        for (int i=0;i<c;i++){
            for(int j=0;j<b;j++){
                if(carray[i]==barray[j]){
                    System.out.println(barray[j]);
                }
            }
        }
    }
}