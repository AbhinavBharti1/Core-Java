import java.util.*;
import java.util.Random;
class game{
    int act_num, guessed_num;

    public game(int act_num){
        System.out.println("Game Begins \nNumber has been decided");
        Random rand = new Random();
        this.act_num = rand.nextInt(100);
    }
    public void take_guess(Scanner sc){
        System.out.println("Enter your guess");
        guessed_num = sc.nextInt();
    }
    public boolean isthatcorrect(){
        if(guessed_num == act_num){
            System.out.println("Congrats, That was correct");
            return true;
        }
        else if (guessed_num > act_num){
            System.out.println("No No, That was too high");
            return false;
        }
        else {
            System.out.println("No No, That was too low");
            return false;
        }
    }
    
}

public class guessing_game {
    public static void main(String[] args) {
        game g = new game(0);
        Scanner sc = new Scanner(System.in);
        boolean b = false;
        while(!b){
            g.take_guess(sc);
           b =  g.isthatcorrect();
        }
        sc.close();
    }
}
