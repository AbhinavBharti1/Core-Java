
public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abhinav");

        //print value of sb
        System.out.println(sb);

        //print specific index 
        System.out.println(sb.charAt(1));

        //change the char at any index
        sb.setCharAt(0,'b');
        System.err.println(sb);

        //inserting value
        sb.insert(0,'a');
        System.err.println(sb);

        //deleting a character
        sb.delete(1, 3);//(start and just before end )
        System.err.println(sb);

        //adding value to string 
        StringBuilder sb2 = new StringBuilder("A");
        sb2.append('b');
        sb2.append('h');
        sb2.append('i');
        System.out.println(sb2);

        //reversing a string
        for (int i = 0 ; i<sb.length()/2 ;i++){
            int front = i;
            int back = sb.length() - 1 - i; //lenght - 1 becase index start from 0 then - i to get to last

           char frontchar = sb.charAt(front);
           char backchar = sb.charAt(back);

           sb.setCharAt(front, backchar);
           sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);

    }
    
}
