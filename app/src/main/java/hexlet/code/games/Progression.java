package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {

    public static final String RULES = "What number is missing in the progression?";

    public static void run(){
        var rounds = new String[3][];
        for (int i =0; i<3; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rounds, RULES);
    }

    public static String[] generateRoundData(){
        var firstNumber = Utils.generateRandomValue(0, 100);
        var progressionSize = Utils.generateRandomValue(4, 10);
        var step = Utils.generateRandomValue(1, 10);
        var index = Utils.generateRandomValue(0, progressionSize);
        var progression = generateProgression(firstNumber, progressionSize, step);
        var answer = progression[index];
        progression[index] = "...";
        var question = String.join(", ", progression);

        String[] mass = new String[2];
        mass[0] = question;
        mass[1] = answer;

        return mass;

    }

    public static String[] generateProgression(int firstNumber, int progressionSize, int step){
        var progression = new String[progressionSize];
        progression[0] = Integer.toString(firstNumber);
        for (var i = 1; i < progressionSize; i++){
            firstNumber += step;
            progression[i] = Integer.toString(firstNumber);
        }
        return progression;
    }
}
