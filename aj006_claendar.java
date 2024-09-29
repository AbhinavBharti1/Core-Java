import java.util.Calendar;
import java.util.TimeZone;
public class aj006_claendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(Calendar.getAvailableCalendarTypes());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE));
    

        Calendar d = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(d.getAvailableCalendarTypes());
        System.out.println(d.getTimeZone().getID());
    }
}
