package games;

import hexlet.code.Engine;

public class Even {

    public static String getRules(){
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] generateRounds(){

        int a = Engine.generateRandomValue(1, 100);
        int b = Engine.generateRandomValue(1, 100);
        int c = Engine.generateRandomValue(1, 100);

        String answer1 = a % 2 == 0 ? "yes" : "no";
        String answer2 = b % 2 == 0 ? "yes" : "no";
        String answer3 = c % 2 == 0 ? "yes" : "no";

        String question1 = "Question: " + Integer.toString(a);
        String question2 = "Question: " + Integer.toString(b);
        String question3 = "Question: " + Integer.toString(c);

        String[][] mass = new String[3][2];

        mass[0][0] = question1;
        mass[0][1] = answer1;
        mass[1][0] = question2;
        mass[1][1] = answer2;
        mass[2][0] = question3;
        mass[2][1] = answer3;

        return mass;

    }
}