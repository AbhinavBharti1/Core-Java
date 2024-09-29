import java.util.* ;

class First {
    public static void main (String args[]){
        System.out.println("Enter you name");
        Scanner sc = new Scanner(System.in);
        //sc.next onl take one word
        String name = sc.next();
        //this will eat the leftover cause by space after next() func
        sc.nextLine();
        System.out.println("Enter you power");
        //sc.next onl take one word
        String fname = sc.nextLine();
        System.out.println("speed score");
        //for integer input
        int a = sc.nextInt();
        System.out.println("strength score");
        //for float input
        float b = sc.nextFloat();
        System.out.println(name+" "+a+" "+b);
        System.out.println(fname);

        sc.close();
    }
}