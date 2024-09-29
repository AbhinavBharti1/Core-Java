import java.util.* ;
public class BitManipulation {
    public static void main(String[] args) {
        // GET   to check wheter the number is 0 or 1
        int num = 5 ;
        int position = 2;
        int bitmask = 1<<position;

        if(bitmask ==0){
            System.out.println(num +" on position " + position + " is zero");
        }
        else{
            System.out.println(num +" on position " + position + " is one");
        }

        //SET   to change bit to one on specific position
        int num1 = 5 ;
        int position1 = 1;
        int bitmask1 = 1<<position1;
        int setvalue = bitmask1 | num1 ; //performing logical or
        System.out.println("Set value for "+num1 +" on position " + position1 + " is " + setvalue);
        
        //CLEAR  to change value to 0 at specific position
        int num2 = 5 ;
        int position2 = 2;
        int bitmask2 = 1<<position2;
        bitmask2 = ~(bitmask2);
        int Clearvalue = bitmask2 & num2 ; //performing logical or
        System.out.println("Clear value for "+ num2 +" on position " + position2 + " is " + Clearvalue);

          //UPDATE   to chnage value desired by user 0 to 1 or 1 to 0    
          Scanner sc = new Scanner(System.in);
          System.out.println("enter 0 for clear or 1 for set");
          int input = sc.nextInt();
          int number = 5 ;
          int pos = 1;

          if(input == 0){
            int bitmask3 = 1<<pos;
            bitmask3 = ~(bitmask3);
            int Clearvalue1 = bitmask3 & number ; //performing logical or
            System.out.println("Clear value for "+ number +" on position " + pos + " is " + Clearvalue1);
    
          }
          else if (input == 1){
            int bitmask4 = 1<<pos;
            int setvalue1 = bitmask4 | number ; //performing logical or
            System.out.println("Set value for "+number +" on position " + pos + " is " + setvalue1);
          }
          else{
            System.out.println("enter valid input");
          }
          sc.close();
          
    }
    
      
}
