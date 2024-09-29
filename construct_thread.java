class mythread_constructor extends Thread{
    public mythread_constructor(String name){
        super(name);
        System.out.println("i ate an apple");
    }
}
public class construct_thread {
    public static void main(String[] args) {
        mythread_constructor t1 = new mythread_constructor("wukong");
        System.out.println("my thread name is "+t1.getName());
    }
}
