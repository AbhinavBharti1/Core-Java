
import java.util.Scanner;

public class nested_trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int apple[] = new int[3];
        apple[0] =45;
        apple[1] =46;
        apple[2] =89;
 
        System.out.println("enter index number");
        int a = sc.nextInt();
        System.out.println("enter number to divide with");
        int b = sc.nextInt();
 
        try {
            System.out.println("index number is "+ apple[a]);
            try {
            System.out.println("value after divide is  "+ apple[a]/b);
            }
            catch(ArithmeticException e){
                System.out.println("we sorry you fucked up by dividing it with zero");
                sc.close();
               } 
            
        }
        catch(ArrayIndexOutOfBoundsException e){
          System.out.println("we sorry you fucked up by putting index exceeding limit");
          sc.close();
        }
       catch (Exception e) {
         System.out.println(e);
         sc.close();
        }
       
    }
}
