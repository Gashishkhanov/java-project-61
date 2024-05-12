package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run(){
        var rounds = new String[3][];
        for (int i =0; i<3; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rounds, RULES);
    }

    public static String[] generateRoundData(){
        var a = Utils.generateRandomValue(1,100);

        String answer = isPrime(a) ? "yes" : "no";

        String[] mass = new String[2];
        mass[0] = Integer.toString(a);
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
