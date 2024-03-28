package games;

import hexlet.code.Engine;

public class Prime {
    public static String getRules(){
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] generateRounds(){
        var a1 = Engine.generateRandomValue(1,100);
        var a2 = Engine.generateRandomValue(1,100);
        var a3 = Engine.generateRandomValue(1,100);

        String question1 = "Question: " + a1;
        String question2 = "Question: " + a2;
        String question3 = "Question: " + a3;

        String answer1 = isPrime(a1) ? "yes" : "no";
        String answer2 = isPrime(a2) ? "yes" : "no";
        String answer3 = isPrime(a3) ? "yes" : "no";

        String[][] mass = new String[3][2];

        mass[0][0] = question1;
        mass[0][1] = answer1;
        mass[1][0] = question2;
        mass[1][1] = answer2;
        mass[2][0] = question3;
        mass[2][1] = answer3;

        return mass;
    }

    public static boolean isPrime(int numberToCheck){
        int remainder;
        boolean isPrime = true;

        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;

            if (remainder == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            return true;
        }
        else {
            return false;
        }
    }
}
