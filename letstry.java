public class letstry {
    public static int add(int a , int b){
        int c = a+b;
        return  c;
    }
    public static void main(String[] args) {
        try{
       System.out.println( add(23,-34));
        }
        catch(ArithmeticException e){
            System.out.println("HAHA");
        }
        catch(IllegalArgumentException e){
            System.out.println("HEHE");
        }
    }
}
