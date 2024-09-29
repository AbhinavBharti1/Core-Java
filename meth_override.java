class a {
    void meth1(){
        System.out.println("original");
    }
}
class b extends a {
    @override
    void meth1(){
        System.out.println("override");
    }
}
  
public class meth_override {
    public static void main(String[] args) {
        a a = new a();
        b b = new b();
        a.meth1();
        b.meth1();
    }
}
