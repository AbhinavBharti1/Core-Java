class phone {
    public void boot(){
        System.out.println("booting up ");
    }
    public void on(){
        System.out.println("turning on phone");
    }
}
class smartphone extends phone{
    public void on(){
        System.out.println("turning on smartphone ");
    }
    public void camera(){
        System.out.println("turning on camera ");
    }
}


public class dynamic_memory_dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();
        obj.boot();
        obj.on();
        smartphone obj2 = new smartphone();
        obj2.camera(); //need to create obj2 to run 
    }
}
