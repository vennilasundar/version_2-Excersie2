
package numberfight_2;

import java.util.Random;


public class NumberFight_2 {
// New branch for pull request
    
    public static void main(String[] args) {
        int M,B;
        Random rn = new Random();
        M = rn.nextInt(10)+1;
        B = rn.nextInt(10)+1;
        if (M>B){
            System.out.println("Micheal won the girl, the value of Micheal is " + M + " and the value of Bruce is " + B);
        }else {
            System.out.println("Bruce won the girl, the value of Bruce is " + B + " and the value of Micheal is " + M);
        }
    }
    
}
