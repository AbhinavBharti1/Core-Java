import java.util.*;
public class ary2d {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[][] array2d = new int[size][3];
            for(int i = 0 ; i < size ; i++){
                for(int j = 0; j<3 ; j++){
                    System.out.println("Enter value for row " + i + ", column " + j + ":");
                    int value = sc.nextInt();
                    array2d[i][j]=value;
                }
            }
            System.out.println("The matrix is:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(array2d[i][j] + " ");
                } 
                System.out.println();
            }
        }
    }
}
