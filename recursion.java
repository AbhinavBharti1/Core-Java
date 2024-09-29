public class recursion {
    //recursion is an occuring happen in Java when the function call itself.
    static int fact(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a * fact(a-1);//method call itself
        }
    }
    static int sumrec(int b){
        if(b==1){
            return 1;
        }
        else{
            return b + sumrec(b-1);
        }
    }
    static int fibonacci(int c){
        if(c==1){
            return 0;
        }
        else if(c==2){
            return 1;
        }
        else{
            return fibonacci(c-1)+fibonacci(c-2);
        }
    }
    static void pattern(int n){
        if(n>0){
            pattern(n-1);
            for(int i=0 ; i<n ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void rep3(int d){
        if(d>0){
            System.out.println(3);
            rep3(d-1);
        }
       
        }
    
    public static void main(String[] args) {
        System.out.println(fact(6));
        System.out.println(sumrec(6));
        System.out.println(fibonacci(6));
        pattern(5);
        rep3(4);
        
    }
}
