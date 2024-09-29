import java.util.*;
public class allaboutstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "abhinav";
        String lastname = "bharti";
        String fullname = "my name is abhinav bharti";
        System.out.println(fullname.length());//to know the length
        //iterate every character (charAt)
        for(int i = 0; i< fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        //comparision : it is better to use compareto() rather than ==
        if(name.compareTo(lastname) == 0){
            System.out.println("equal");
        }
        else{System.out.println("not equal");

        }

        //subtring (.substring(beging index and end index))
        String oname = fullname.substring(11);
        System.err.println(oname);
        sc.close();
    }
}
