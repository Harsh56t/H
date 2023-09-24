package OOPS;

import java.util.Random;
import java.util.Scanner;

class Game {
    int number;
    int numOfGase = 0;
    int inputNum;

    public int getnumOfGase() {
        return numOfGase;
    }

    public void setnumOfGase(int numOfGase) {
        this.numOfGase = numOfGase;
    }

    Game() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the nuber");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();

    }

    boolean isCorrectNum() {
        numOfGase++;
        if (inputNum == number) {
            System.out.println("Yes you guessed num of " + numOfGase);
            return true;
        } else if (inputNum < number) {
            System.out.println("Too low..");
        } else if (inputNum > number) {
            System.out.println("Too high..");
        }
        return false;
    }
}

public class gase_game {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNum();
        }

    }

}
