package games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    public static void game() {
        var count = 0;
        while (count < 3) {

            var correctMass = Engine.getQuestionAnswer(
                    Engine.getRandomValue(1, 100),
                    Engine.getRandomValue(1, 100),
                    Engine.getRandomValue(1, 100));

            System.out.println(correctMass[0][0]);
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();
            if (userAnswer.equals(correctMass[0][1])) {
                System.out.println("Correct!");
                count++;
                System.out.println(correctMass[1][0]);
                Scanner scan1 = new Scanner(System.in);
                String userAnswer1 = scan1.nextLine();
                if (userAnswer1.equals(correctMass[1][1])) {
                    System.out.println("Correct!");
                    count++;
                    System.out.println(correctMass[2][0]);
                    Scanner scan2 = new Scanner(System.in);
                    String userAnswer2 = scan2.nextLine();
                    if (userAnswer2.equals(correctMass[2][1])) {
                        System.out.println("Correct!");
                        count++;
                    } else {
                        count = 0;
                        System.out.println(userAnswer2 + " is wrong answer ;( . Correct answer was " + correctMass[2][1]);
                    }
                } else {
                    count = 0;
                    System.out.println(userAnswer1 + " is wrong answer ;( . Correct answer was " + correctMass[1][1]);
                }
            } else {
                count = 0;
                System.out.println(userAnswer + " is wrong answer ;( . Correct answer was " + correctMass[0][1]);
            }
        }
    }
}