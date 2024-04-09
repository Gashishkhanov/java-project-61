package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static String getRules(){
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] generateRounds(){
        String[][] mass = new String[3][];

        mass[0] = generateRoundData();
        mass[1] = generateRoundData();
        mass[2] = generateRoundData();

        return mass;
    }

    public static String[] generateRoundData(){
        var a = Engine.generateRandomValue(1,100);

        String question = "Question: " + a;
        String answer = isPrime(a) ? "yes" : "no";

        String[] mass = new String[2];
        mass[0] = question;
        mass[1] = answer;

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

        return isPrime;
    }
}
