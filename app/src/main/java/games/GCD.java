package games;

import hexlet.code.Engine;

public class GCD {
    public static String getRules(){
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] generateRounds(){
        var a1 = Engine.generateRandomValue(1,50);
        var b1 = Engine.generateRandomValue(1,50);

        var a2 = Engine.generateRandomValue(1,50);
        var b2 = Engine.generateRandomValue(1,50);

        var a3 = Engine.generateRandomValue(1,50);
        var b3 = Engine.generateRandomValue(1,50);

        String question1 = "Question: " + a1 + " " + b1;
        String question2 = "Question: " + a2 + " " + b2;
        String question3 = "Question: " + a3 + " " + b3;

        String answer1 = Integer.toString(gcd(a1,b2));
        String answer2 = Integer.toString(gcd(a2,b2));
        String answer3 = Integer.toString(gcd(a3,b3));

        String[][] mass = new String[3][2];

        mass[0][0] = question1;
        mass[0][1] = answer1;
        mass[1][0] = question2;
        mass[1][1] = answer2;
        mass[2][0] = question3;
        mass[2][1] = answer3;

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
