public class ques7 {
    public static void main(String[] args) {
        int seconds = 864080779;
        int days = seconds/(60*60*24);
        int seconds_left = seconds%(60*60*24);
        int hours = seconds_left/(60*60);
        int hours_seconds_left = seconds_left%(60*60);
        int minutes = hours_seconds_left/(60);
        int hours_seconds_minutes_left = hours_seconds_left%60;

        System.out.println("Days : "+days+" Hours "+hours+" Minutes "+minutes+" seconds "+hours_seconds_minutes_left);
        /*System.out.println(hours_seconds_left);
        System.out.println(seconds_left);
        System.out.println(hours_seconds_minutes_left);*/
    }

}
