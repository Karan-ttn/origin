class barista {
    static int token=0;
    barista(){
        token++;
        System.out.println("Order under process");
    }

}
class cashier extends barista {
    int payment;
    String order;
    cashier(int payment,String order){
        this.payment=payment;
        this.order=order;
    }
    public int getToken(){
        return this.token;
    }
}
class customer extends cashier{
    String name;
    customer(String name, int payment,String order){
        super(payment,order);
        this.name=name;
    }
}
class main19{
    public static void main(String[] args) {
        customer c1=new customer("Karan",100, "Cold Coffee1");
        System.out.println(c1.name+" with order_id "+c1.getToken() + " order_name " +c1.order+" recieved successfully");
        customer c2=new customer("Piu",200, "Tee");
        System.out.println(c2.name+" with order_id "+c2.getToken()+ " order_name " +c2.order+" recieved successfully");
        System.out.println("Order received successfully");
    }
}