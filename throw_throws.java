
import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString(){
        return "radius cannot be negative";
    }
}
public class throw_throws {

    public static double area(int r) throws myexception{
        if(r<0){
            throw new myexception();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {
        myexception mex = new myexception();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int a = sc.nextInt();
      try {
        System.out.println(area(a));
      } catch (Exception e) {
        System.out.println("this is exception");
        System.out.println(mex.toString());
      }
      sc.close();
    }
    
    
}
