package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;

public class Progression {
    public static String getRules(){
        return "What number is missing in the progression?";
    }

    public static String[][] generateRounds(){
        String[][] mass = new String[3][];

        mass[0] = generateRoundData();
        mass[1] = generateRoundData();
        mass[2] = generateRoundData();

        return mass;
    }

    public static String[] generateRoundData(){
        var d = Engine.generateRandomValue(1, 10);
        var index = Engine.generateRandomValue(0, 9);
        var progression = generateProgression(d);
        var element = progression.get(index);

        String question1 = "Question: " + getProgressionWithBottoms(progression, index);

        String[] mass = new String[2];
        mass[0] = question1;
        mass[1] = element;

        return mass;
    }

    public static ArrayList<String> generateProgression(int progression){
        ArrayList<String> massString = new ArrayList<>();
        var a = Engine.generateRandomValue(1,10);
        massString.add(String.valueOf(a));
        for (var i = 0; i < 9; i++){
            a += progression;
            massString.add(String.valueOf(a));
        }
        return massString;
    }

    public static ArrayList<String> getProgressionWithBottoms(ArrayList<String> massString, int index){
        massString.set(index, "...");
        return massString;
    }
}
