
import java.util.Scanner;

public class loop_trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
        try {
            System.out.println("enter number 1 ");
            int a = sc.nextInt();
            System.out.println("enter number 2 ");
            int b = sc.nextInt();
        int c= a/b;
        System.out.println(c);
        flag = false;
        }
        catch(Exception e){
            System.out.println("you can't divide number, try again");
            System.out.println(e);
            
        }
        
    }
    sc.close();
    }
}
