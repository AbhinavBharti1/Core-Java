import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("enter you salary (in lakhs)");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if(salary>=20){
            System.out.println("you are fucking rich man");

        }
        else if(salary<20 && salary>2){
            System.out.println("you are middle class");
        }
        else{
            System.out.println("i'm sorry bro you are poor");
        }
        sc.close();
    }
}
