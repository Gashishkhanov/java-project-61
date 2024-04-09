package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Arrays;

public class Calc {

    public static String getRules(){
        return "What is the result of the expression?";
    }

    public static String[][] generateRounds(){
        var a1 = Engine.generateRandomValue(1, 50);
        var b1 = Engine.generateRandomValue(1, 10);
        var randomOperator1 = getRandomOperator("+", "*");

        var a2 = Engine.generateRandomValue(1, 50);
        var b2 = Engine.generateRandomValue(1, 10);
        var randomOperator2 = getRandomOperator("+", "*");

        var a3 = Engine.generateRandomValue(1, 50);
        var b3 = Engine.generateRandomValue(1, 10);
        var randomOperator3 = getRandomOperator("+", "*");


        String question1 = "Question: " + a1 + " " + randomOperator1 + " " + b1;
        String question2 = "Question: " + a2 + " " + randomOperator2 + " " + b2;
        String question3 = "Question: " + a3 + " " + randomOperator3 + " " + b3;

        String answer1 = randomOperator1.equals("+") ? Integer.toString(a1 + b1) : Integer.toString(a1 * b1);
        String answer2 = randomOperator2.equals("+") ? Integer.toString(a2 + b2) : Integer.toString(a2 * b2);
        String answer3 = randomOperator3.equals("+") ? Integer.toString(a3 + b3) : Integer.toString(a3 * b3);

        String[][] mass = new String[3][2];

        mass[0][0] = question1;
        mass[0][1] = answer1;
        mass[1][0] = question2;
        mass[1][1] = answer2;
        mass[2][0] = question3;
        mass[2][1] = answer3;

        return mass;
    }

    public static String getRandomOperator(String oper, String oper1){
        var random = new SecureRandom();
        var operator = Arrays.asList(oper, oper1);
        return operator.get(random.nextInt(operator.size()));
    }
}
