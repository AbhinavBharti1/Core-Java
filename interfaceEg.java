interface camera{
    void takesnap();
    void record();
    default void potraitMode(){
        System.out.println("taking potrait mode pictures");
    }
}
interface wifi{
    String[] getNetwork();
    void connectNetwork(String network);
}
abstract class cellphone{
     void callNumber(int phonenumber){
        System.out.println("calling -> "+phonenumber);
     }
     void pickCall(int phonenumber){
        System.out.println("connecting to -> "+phonenumber);
     }
}

class smartphone extends cellphone implements camera,wifi{
    @Override
    public void takesnap(){
        System.out.println("clicking picture");
    }
    @Override
    public void record(){
        System.out.println("recording video");
    }
    @Override
    public String[] getNetwork(){
        System.out.println("available networks are");
        String [] networklist = {"my wifi1","my wifi2","my wifi3","my wifi4"};
        return networklist;
    }
    @Override
    public void connectNetwork(String network){
        System.out.println("connecting to " + network);
    }
}
public class interfaceEg{
    public static void main(String[] args) {
        smartphone ms = new smartphone();
        String[] ar = ms.getNetwork();
        for(String a: ar){
            System.out.println(a);
        }
        ms.callNumber(9877655);
        ms.pickCall(98384647);
        ms.takesnap();
        ms.record();
        ms.potraitMode();
        ms.connectNetwork("anexwifi");


    }
}
