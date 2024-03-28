package hexlet.code;

import games.*;

import java.util.Scanner;

public class Engine {

    public static void runPointEnter(int pe){
        switch (pe){

            case 1:
                Greet.getGreet();
                break;

            case 2:
                run(Even.generateRounds(), Even.getRules());
                break;

            case 3:
                run(Calc.generateRounds(), Calc.getRules());
                break;

            case 4:
                run(GCD.generateRounds(), GCD.getRules());
                break;

            case 5:
                Engine.run(Progression.generateRounds(), Progression.getRules());
                break;

            case 6:
                Engine.run(Prime.generateRounds(), Prime.getRules());
                break;

        }
    }

    public static void run(String[][] rounds, String rules){

        Greet.getGreet();

        System.out.println(rules);

        for (int i =0; i<3; i++) {
            System.out.println(rounds[i][0]);
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();
            if (userAnswer.equals(rounds[i][1])) {
                System.out.println("Correct!");
                if (i == 2){
                    System.out.println("Congratulations, " + Cli.getName() + "!");
                }
            } else {
                System.out.println(userAnswer + " is wrong answer ;( . Correct answer was " + rounds[i][1]);
                break;
            }
        }
    }


    public static int generateRandomValue(int minValue, int maxValue){
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
}
