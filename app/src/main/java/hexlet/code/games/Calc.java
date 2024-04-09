package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Arrays;

public class Calc {

    public static String getRules(){
        return "What is the result of the expression?";
    }

    public static String[][] generateRounds(){

        String[][] mass = new String[3][];

        mass[0] = generateRoundData();
        mass[1] = generateRoundData();
        mass[2] = generateRoundData();

        return mass;
    }

    public static String[] generateRoundData(){

        var a = Engine.generateRandomValue(1, 50);
        var b = Engine.generateRandomValue(1, 10);
        var randomOperator = getRandomOperator("+", "*");

        String question = "Question: " + a + " " + randomOperator + " " + b;
        String answer = randomOperator.equals("+") ? Integer.toString(a + b) : Integer.toString(a * b);

        String[] mass = new String[2];
        mass[0] = question;
        mass[1] = answer;

        return mass;
    }

    public static String getRandomOperator(String oper, String oper1){
        var random = new SecureRandom();
        var operator = Arrays.asList(oper, oper1);
        return operator.get(random.nextInt(operator.size()));
    }
}
