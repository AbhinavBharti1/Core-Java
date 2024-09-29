import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter + - * / ");
        String opr = sc.next();
        System.out.println("Enter next number");
        int b = sc.nextInt();
        int c=0;
        
       switch(opr){
        case("+") :
            c = a+b;
            System.out.println(c);
            break;
        case("-") :
            c = a-b;
            System.out.println(c);
            break;
        case("*") :
            c = a*b;
            System.out.println(c);
            break;
        case("/") :
            c = a/b;
            System.out.println(c);
            break;
        default:
            System.out.println("Invalid input");
        
       }
       int x=1;
while(x!=0){
System.out.println("enter operator to calculate further or enter any other key to exit");
String d = sc.next();
if(d.equals("+") || d.equals("-") || d.equals("*") || d.equals("/")){
    int f;
    System.out.println("Enter next number");
        int e = sc.nextInt();
    switch(d){
        case("+") :
            f = c+e;
            System.out.println(f);
            c=f;
            break;
        case("-") :
            f = c-e;
            System.out.println(f);
            c=f;
            break;
        case("*") :
            f = c*e;
            System.out.println(f);
            c=f;
            break;
        case("/") :
            f = c/e;
            System.out.println(f);
            c=f;
            break;
        default:
            System.out.println("Invalid option");
        
       }
    }
    else{
        System.out.println("Babye");
        x=0;
    }
}
sc.close();

    }
}
