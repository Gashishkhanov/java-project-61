package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static String getRules(){
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] generateRounds(){
        String[][] mass = new String[3][];
        mass[0] = generateRoundDate();
        mass[1] = generateRoundDate();
        mass[2] = generateRoundDate();

        return mass;
    }

    public static String[] generateRoundDate(){
        var a = Engine.generateRandomValue(1,50);
        var b = Engine.generateRandomValue(1,50);

        String question = "Question: " + a + " " + b;
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
