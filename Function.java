import java.util.*;

public class Function{
    public static void PrintName(String name){
        System.out.println(name+" bharti");
    }
    public static int Add2num(int a , int b){
        int c = a+b;
        System.out.println(c);
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to print your name\n" +
                            "enter 2 to add number\n" +
                            "enter 3 to exit");
        int d = sc.nextInt();
        if(d==1){
        System.out.println("name");
        String name = sc.next();
        PrintName(name);}
        else if(d==2){
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        Add2num(a, b);}
        else{
            System.out.println("babye");
        }

        
        sc.close();
       
    }
}