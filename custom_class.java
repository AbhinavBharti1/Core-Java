//class difclass{
    // int a ,sqr;
    // String b ; 
    // String name = "radhe";
    // String new_name;
    // public void printing(){
    //     System.out.println("number is "+a);
    //     System.out.println("string is "+b);
    // }
    // public String getname(){
    //     return name;
    // }
    // public void setname(String new_name){
    //     name = new_name;
    // }
    
//}
//class square{
//     public void side(int sqr){
//         System.out.println("side of a square is "+ sqr);
//     }
//     public void perimeter(int sqr){
//         sqr = 4*sqr;
//         System.out.println("perimeter of a square is "+ sqr);
//     }
//     public void area(int sqr){
//         sqr = sqr * sqr;
//         System.out.println("area of a square is "+ sqr);
//     }
// }
class cons{
    String n ;
    public cons(){
        n= "apple";
    }

    public cons(int a){
        System.out.println(a);
    }
}
public class custom_class {
    public static void main(String[] args) {


        // difclass abhi = new difclass();
        // difclass pal = new difclass();//instantiating a new difclass object as abhi
        // abhi.a = 45;
        // abhi.b = "orange is the new black";
        // pal.a = 50;
        // pal.b = "black is the new orange";
        // System.out.println(abhi.b+" \n"+abhi.a);
        // abhi.printing();
        // pal.printing();


        // difclass naming = new difclass();
        // System.out.println(naming.getname());
        // naming.setname("abhinav");
        // System.out.println(naming.getname());
        // square sqv = new square();
        // sqv.side(4);
        // sqv.perimeter(6);
        // sqv.area(6);

        cons cnstr = new cons(67);
        System.out.println(cnstr.n);//without any value construtor initialised and give value to n
        cnstr.n="mango";//updated the value of n 
        System.out.println(cnstr.n);
    }
}
