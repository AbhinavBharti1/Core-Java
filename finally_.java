public class finally_{
    public static Object add(int a , int b){
        try {
            int c=a/b;
            return c;
        } catch (Exception e) {
            
        }
        finally{
            System.out.println("this has to be run");
        }
        return "hehe you are dumb, don't you know we cannot divide anything with 0";
    }
    public static void main(String[] args) {
        System.out.println(add(45,0));

    }
    
}
