package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.GENERAL_VALUE;

public class Even {

    public static final int NUMBER_LIMIT = 100;
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        var rounds = new String[GENERAL_VALUE][];
        for (int i = 0; i < GENERAL_VALUE; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rounds, RULES);
    }

    public static String[] generateRoundData() {
        var a = Utils.generateRandomValue(1, NUMBER_LIMIT);

        String[] mass = new String[2];
        mass[0] = Integer.toString(a);
        mass[1] = isEven(a) ? "yes" : "no";

        return mass;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
