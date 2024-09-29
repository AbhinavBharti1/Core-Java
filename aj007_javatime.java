import java.time.*;
import java.time.format.DateTimeFormatter;
public class aj007_javatime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalTime e = LocalTime.now();
        System.out.println(d +"\n"+ e );
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String mydate = dt.format(df);
        System.out.println(mydate );
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd--*--MM--*--yyyy");
        String mydate1 = dt.format(df1);
        System.out.println(mydate1 );

         
    }
}
