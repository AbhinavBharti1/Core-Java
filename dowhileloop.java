import java.util.*;
public class dowhileloop {
    public static void main(String[] args) {
        System.out.println("if you love me guess a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = num-1;
        do{
            System.out.println(num-i+". I Love You");
            i--;
        }while(i!=-1);
        sc.close();
    }
}
