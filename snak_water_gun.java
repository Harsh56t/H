package addisnal_work_Switch_case;
import java.util.Scanner;

import pak.brack;

import java.util.Random;
public class snak_water_gun {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        Random random = new Random();
        boolean playagain = true;
        while(playagain){
            System.out.println("Enter 0 for snak  ,1 for water ,2 to gun,3 for exit");
                    int userInput=  game.nextInt();
                    if(userInput==3){
                    System.out.println("Thank you for playing");
                    break;
                    }
                    else if(userInput<0||userInput>3){
                        System.out.println("pleas inter valid input");
                        continue;
                    }
                    int compInput = random.nextInt(3);
                    if(compInput==0){
                        System.out.println("computer choice snake");
                    }
                    else if(compInput==1){
                        System.out.println("computer choice water");
                    }
                    else{
                        System.out.println("computer choice gun");
                    }
                    if(compInput==1){
                        System.out.println("Both are chose same then deaw");
                    }
                    else if(userInput==2&&compInput==0||userInput==1&&compInput==0||userInput==1&&compInput==2){
                        System.out.println("you win");
                    }
                    else{
                        System.out.println("computer win");
                    }
                    System.out.println("Press '1' for play again and '0' for exit ");
                    int play = game.nextInt();
                    if(playagain=(play==1)){
                    }
                    else{
                        System.out.println("thank you for playing play again");
                    }
                }
    }
}
