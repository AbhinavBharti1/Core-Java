import java.util.*;
public class aj03_Arraydequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(56);
        ad1.add(67);
        ad1.add(34);
        ad1.add(45);

        ad1.getFirst();
        ad1.peekFirst() ; //same as above but use to avoid any exception
        ad1.getLast();
        ad1.peekLast() ;//same as above but use to avoid any exception
        ad1.addFirst(12);
        ad1.offerFirst(23) ;//same as above but use to avoid any exception
        ad1.addLast(45);
        ad1.offerLast(45) ;//same as above but use to avoid any exception
        ad1.removeFirst();
        ad1.pollFirst();//same as above but use to avoid any exception
        ad1.removeFirst();
        ad1.pollFirst();//same as above but use to avoid any exception
        
    }
}
