package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

import static hexlet.code.games.Even.generateRoundData;

public class Engine {

    public static void run(String[][] rounds, String rules){

        Cli.getGreet();

        System.out.println(rules);

        for (int i =0; i<3; i++) {
            System.out.println(rounds[i][0]);
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();
            if (userAnswer.equals(rounds[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;( . Correct answer was " + rounds[i][1]);
                System.out.println("Let`s try again, " + Cli.getName());
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    public static int generateRandomValue(int minValue, int maxValue){
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
}
