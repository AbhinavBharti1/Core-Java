import java.util.*;
public class aj004_hashset {
    public static void main(String[] args) {
        HashSet<Integer>  myhashset = new HashSet<>(); 
        HashSet<Integer>  myhashset2 = new HashSet<>(6,0.5f); 
        myhashset.add(34);
        myhashset.add(43);
        myhashset.add(65);
        myhashset.add(68);
        myhashset.add(34);
        System.out.println(myhashset);
        myhashset2.add(67);
    }
}
