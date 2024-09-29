import java.util.*;

public class Array {
    public static void main(String[] args) {
        int ary[] = { 1, 2, 5, 6, 7, 8 };// to initialise an array without new keyword

        Scanner sc = new Scanner(System.in);
        System.out.println();
        int[] firstary = new int[12]; // to initialise an array we use new keyword
        
        for (int i = 0; i < 3; i++) {

            System.out.println("enter marks");
            int marks = sc.nextInt();
            firstary[i] = marks;
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(firstary[i] + " ");
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(ary[i] + " ");
        }
        sc.close();
    }
}
