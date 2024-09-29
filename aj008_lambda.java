interface fruit{
    void apple();
}
public class aj008_lambda {
    public static void main(String[] args) {
        fruit obj = ()-> {
            System.out.println("i am an apple ");
        };
        obj.apple();
    }
}
