interface cycle{
   String apple = "mango";
    void applybrake(int decrement);
    void applyspeed();
}
interface vehicle{
    void wheel();
}
class avon implements cycle,vehicle{
    @Override
    public void applybrake(int increment){
        System.out.println("applying brake...");
    }
    @Override
    public void applyspeed(){
        System.out.println("applying speed...");
    }
    @Override
    public void wheel(){
        System.out.println("2 wheel");
    }
}
public class Intrfce {
public static void main(String[] args) {
    avon ac = new avon();
    ac.applybrake(45);
    ac.applyspeed();
    ac.wheel();
    System.out.println(cycle.apple);
    
}
}