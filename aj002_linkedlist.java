import java.util.*;

public class aj002_linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(64);
        l1.add(74);
        l1.add(84);
        l1.add(94);
        System.out.println(l1.size());

        // for(int e : l1){
        //     System.out.println(e);
        // }
        System.out.println("-----------------------------------------");
        l2.add(0001);
        l2.add(0002);
        l2.add(0003);
        l1.addAll(l2);
        // for(int i; i<l1.size();i++){
        //     System.out.println(e);
        // }
        //l1.clear();
        System.out.println(l1.contains(1)) ;
        System.out.println(l1.indexOf(1)) ;
        System.out.println(l1.set(1,5678)) ;
        
    }
}
