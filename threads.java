class mythread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("thread111");
            i++;
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("thread222");
            i++;
        }
    }
}
public class threads {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();


        
    }
}
