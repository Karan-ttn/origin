public class banks {
    String Bankname;
    banks(String name){
        this.Bankname=name;
    }
    public static void main(String[] args) {
        sbi s = new sbi(" SBI",21,2111);
        System.out.println(s.getDetails());
        boi b = new boi("BOI",12,122,3);
        System.out.println(b.getDetails());
        icici i = new icici("ICICI",2,1);
        System.out.println(i.getDetails());
    }

    public String getDetails(){
        return this.getDetails();
    }
}

class sbi extends banks{
        int roi;
        int turnover;
        sbi(String name,int roi,int turnover){
            super(name);
            this.roi = roi;
            this.turnover = turnover;
        }
        public String getDetails(){
            String h = " Name of bank"+this.Bankname+" Rate of Interest "+roi+" Turnover is "+turnover;
            return h;
        }
    }

class boi extends banks{
        int roi;
        int turnover;
        int debt;
        boi(String name,int roi,int turnover,int debt){
            super(name);
            this.roi=roi;
            this.turnover=turnover;
            this.debt=debt;
        }
        public String getDetails(){
            String h = " Name of bank"+this.Bankname+" Rate of Interest "+roi+" Turnover is "+turnover+" Debt is "+debt;
            return h;
        }
    }
class icici extends banks{
    int roi;
    int turnover;
    icici(String name,int roi,int turnover){
        super(name);
        this.roi=roi;
        this.turnover=turnover;
    }
    public String getDetails(){
        String h = " Name of bank"+this.Bankname+" Rate of Interest "+roi+" Turnover is "+turnover;
        return h;
    }
    }



