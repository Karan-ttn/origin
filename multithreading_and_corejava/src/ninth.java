import java.util.Arrays;
import java.util.List;

public class ninth
{
    public enum Houses{
        houses1(100000L,"Kanpur"),
        houses2(160000L,"Delhi");
        Long prices;
        String location;

        Houses(Long prices,String location){
            this.prices = prices;
            this.location = location;
        }

        public Long getPrices() {
            return prices;
        }
        public String getLocation(){ return location;}
    }

    public static void main(String[] args) {
        /*Houses h1 = Houses.houses1;
        Houses h2 = Houses.houses2;
        System.out.println(h1.getPrices());
        System.out.println(h2.getPrices());*/
        List<Houses> enum_list = Arrays.asList(Houses.values());
        for(Houses h:enum_list){
            System.out.println(h+" "+h.getPrices()+" "+h.getLocation());
        }
    }
}
