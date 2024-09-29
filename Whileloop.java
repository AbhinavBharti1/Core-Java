import java.util.*;
public class Whileloop {
    public static void main(String[] args) {
        System.out.println("if you love me guess a number");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int i = num-1;
        while(i!=-1){
            System.out.println(num-i+". I Love You");
            i--;
        }
        sc.close();
    }
}
