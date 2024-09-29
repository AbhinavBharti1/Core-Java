abstract class parent{
    public parent(){
        System.out.println("abstract constructor");
    }
    abstract public void sayhello();
    abstract public void saybye();
}
class child1 extends parent{
    @override
        public void sayhello(){
            System.out.println("hello");
        }
        public void saybye(){
            System.out.println("bye");
        }
}
public class its_abstact {
    public static void main(String[] args) {
        child1 child = new child1();
        child.saybye();
        child.sayhello();
    }
}
