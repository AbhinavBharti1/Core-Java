
import java.util.Date;
public class aj005_time {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // milisecond divde/ to get sec/hour/days/then year
        Date d = new Date();
        System.out.println(d);
    }
}
