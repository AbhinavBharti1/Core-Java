class father{
private int x;

   public void setx(int x){
    this.x = x;
   }
   public int getx(){
        return x;
   }
    
   public father(){
    System.out.println("this is constructor");
   }
   public father(int a){
    System.out.println("this is pareterized constructor" + a);
 }
}

class son extends father{
    private int y;
    
 public son(){

    super(78);
    System.out.println("this is son contructor");
 }
 
    public void sety(int m){
     y = m;
     
    }
    public int gety(){
         return y;
    }
   
     
 }
 class grandson extends son{
    private int z;
 
    public void setz(int k){
     z = k;
     
    }
    public int getz(){
         return z;
    }
     
 }

public class inheritance {
    public static void main(String[] args) {
        // father ft = new father();
        // ft.setx(567); 
        // System.out.println(ft.getx());


        son sc = new son();
        sc.setx(567); //applying inheritance to use getx from superclass
        System.out.println(sc.getx());
        sc.sety(678533);
        System.out.println(sc.gety());

        // grandson gs = new grandson();
        // gs.setx(567); //applying inheritance to use getx from superclass
        // System.out.println(gs.getx());
        // gs.sety(678533);
        // System.out.println(gs.gety());
        // gs.setz(324);
        // System.out.println(gs.getz());

        
    }
}
