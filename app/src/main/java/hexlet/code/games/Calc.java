package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.generateRandomValue;

public class Calc {

    public static final char[] SYMBOLS = {'+', '*', '-'};
    public static final int FIRST_NUMBER_LIMIT = 50;
    public static final int SECOND_NUMBER_LIMIT = 10;
    public static final String RULES = "What is the result of the expression?";

    public static void run(){
        var rounds = new String[3][];
        for (int i =0; i<Engine.GENERAL_VALUE; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rounds, RULES);
    }

    public static String[] generateRoundData(){

        var a = generateRandomValue(1, FIRST_NUMBER_LIMIT);
        var b = generateRandomValue(1, SECOND_NUMBER_LIMIT);
        var index = generateRandomValue(0, SYMBOLS.length - 1);

        String question = a + " " + SYMBOLS[index] + " " + b;

        String answer = switch (index) {
            case 0 -> Integer.toString(a + b);
            case 1 -> Integer.toString(a * b);
            case 2 -> Integer.toString(a - b);
            default -> throw new RuntimeException("Опрератор неопределен!");
        };

        String[] mass = new String[2];
        mass[0] = question;
        mass[1] = answer;

        return mass;
    }
}
