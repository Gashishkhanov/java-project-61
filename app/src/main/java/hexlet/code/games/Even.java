package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static String getRules(){
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] generateRounds(){

        String[][] mass = new String[3][];

        mass[0] = generateRoundData();
        mass[1] = generateRoundData();
        mass[2] = generateRoundData();

        return mass;

    }

    public static String[] generateRoundData(){
        var a = Engine.generateRandomValue(1, 100);

        String answer = a % 2 == 0 ? "yes" : "no";
        String question = "Question: " + a;

        String[] mass = new String[2];
        mass[0] = question;
        mass[1] = answer;

        return mass;
    }
}