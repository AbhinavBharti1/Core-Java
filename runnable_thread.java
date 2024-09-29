class mythread implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("thread111");
            i++;
        }
    }
}
class mythread2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i<4000){
            System.out.println("thread222");
            i++;
        }
    }
}
public class runnable_thread {
    public static void main(String[] args) {
        mythread bullet1 = new mythread();//your method thatneed to run
        Thread gun1 = new Thread(bullet1);//this will run you method
        mythread2 bullet2 = new mythread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();


        
    }
}
