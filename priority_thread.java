class mythr extends Thread{
    public mythr(String name){
        super(name); 
    }
    @Override
    public void run(){
        int i = 0;
        while(true){
        System.out.println("this is "+this.getName());
        i++;
    }
}
}
public class priority_thread {
    public static void main(String[] args) {
        mythr t1 = new mythr("1. abhi(most important)");
        mythr t2 = new mythr("2. abhi");
        mythr t3 = new mythr("3. abhi");
        mythr t4 = new mythr("4. abhi");
        mythr t5 = new mythr("5. abhi");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
