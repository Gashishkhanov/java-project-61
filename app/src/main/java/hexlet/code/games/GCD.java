package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void run(){
        var rounds = new String[3][];
        for (int i =0; i<Engine.GENERAL_VALUE; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rounds, RULES);
    }

    public static String[] generateRoundData(){
        var a = Utils.generateRandomValue(1,50);
        var b = Utils.generateRandomValue(1,50);

        String question = a + " " + b;
        String answer = Integer.toString(gcd(a,b));

        String[] mass = new String[2];
        mass[0] = question;
        mass[1] = answer;

        return mass;
    }

    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
