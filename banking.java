import java.util.*;
public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CBalance = 0 ;
        System.out.println("welcome to jhantu bank");
        boolean b = true;
        while(b){
        System.err.println("press 1 for know current balance\npress 2 to credit money \npress 3 for withdrawl \npress 4 to exit");
        int Action = sc.nextInt();
        if(Action==1 || Action==2 || Action==3 )
        switch(Action){
            case 1:
            System.out.println("your current balance is "+ CBalance);
            break;
            case 2:
            System.out.println("enter the amount you want to credit");
            int amnt=sc.nextInt();
            CBalance +=amnt;
            System.out.println("succesfully added");
            System.out.println("your current balance is "+ CBalance);
            break;
            case 3:
            System.out.println("Enter the money you want to withdraw");
            int amnt2=sc.nextInt();
            CBalance -= amnt2;
            System.out.println("succesfully debited");
            System.out.println("your current balance is "+ CBalance);
            break;
            default:
            System.out.println("Invalid input");
            break;
        }
        else{
            b=false;
        }

    }
    sc.close();
    }
}
