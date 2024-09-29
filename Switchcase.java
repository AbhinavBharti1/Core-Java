import java.util.*;
public class Switchcase {
    public static void main(String[] args) {
        System.out.println("1 for salary for 20 lakhs\n"+
                            "2 for salary between 20 to 2 lakhs\n"+
                            "3 for less than 2 lakhs");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        switch (salary) {
            case 1:
            System.out.println("you are fucking rich man");
                
            break;
            case 2:
            System.out.println("you are middle class"); 
            break;

            case 3:
            System.out.println("i'm sorry bro you are poor");   
            break;
        
            default:
            System.out.println("enter fucking valid input , you dumbfuck ");
                break;
        }
        sc.close();
    }
}
