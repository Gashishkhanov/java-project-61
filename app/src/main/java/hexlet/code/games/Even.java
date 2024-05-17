package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run(){
        var rounds = new String[3][];
        for (int i =0; i<Engine.GENERAL_VALUE; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rounds, RULES);
    }

    public static String[] generateRoundData(){
        var a = Utils.generateRandomValue(1, 100);

        String[] mass = new String[2];
        mass[0] = Integer.toString(a);
        mass[1] = isEven(a);

        return mass;
    }

    public static String isEven(int a){
        return a % 2 == 0 ? "yes" : "no";
    }
}