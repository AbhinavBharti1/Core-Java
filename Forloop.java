import java.util.*;

public class Forloop {
    public static void main(String[] args) {
        System.out.println("if you love me guess a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 1;
        for(int i = 0;i < num ;i++){
            System.out.println((a)+". I Love you ");
            a++;
        }
        sc.close();
    }
}
