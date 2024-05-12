package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.security.SecureRandom;
import java.util.Arrays;

public class Calc {

    public static final String RULES = "What is the result of the expression?";

    public static void run(){
        var rounds = new String[3][];
        for (int i =0; i<3; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rounds, RULES);
    }

    public static String[] generateRoundData(){

        var a = Utils.generateRandomValue(1, 50);
        var b = Utils.generateRandomValue(1, 10);
        var randomOperator = getRandomOperator("+", "*", "-");

        String question = a + " " + randomOperator + " " + b;

        String answer = switch (randomOperator) {
            case "+" -> Integer.toString(a + b);
            case "*" -> Integer.toString(a * b);
            case "-" -> Integer.toString(a - b);
            default -> "";
        };

        String[] mass = new String[2];
        mass[0] = question;
        mass[1] = answer;

        return mass;
    }

    public static String getRandomOperator(String oper, String oper1, String oper2){
        var random = new SecureRandom();
        var operator = Arrays.asList(oper, oper1, oper2);
        return operator.get(random.nextInt(operator.size()));
    }
}
