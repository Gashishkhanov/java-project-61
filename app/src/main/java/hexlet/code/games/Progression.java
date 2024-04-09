package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;

public class Progression {
    public static String getRules(){
        return "What number is missing in the progression?";
    }

    public static String[][] generateRounds(){
        var d1 = Engine.generateRandomValue(1, 10);
        var index1 = Engine.generateRandomValue(0, 9);
        var progression1 = generateProgression(d1);
        var element1 = progression1.get(index1);

        var d2 = Engine.generateRandomValue(1, 10);
        var index2 = Engine.generateRandomValue(0, 9);
        var progression2 = generateProgression(d2);
        var element2 = progression2.get(index2);

        var d3 = Engine.generateRandomValue(1, 10);
        var index3 = Engine.generateRandomValue(0, 9);
        var progression3 = generateProgression(d3);
        var element3 = progression3.get(index3);

        String question1 = "Question: " + getProgressionWithBottoms(progression1, index1);
        String question2 = "Question: " + getProgressionWithBottoms(progression2, index2);
        String question3 = "Question: " + getProgressionWithBottoms(progression3, index3);

        String[][] mass = new String[3][2];

        mass[0][0] = question1;
        mass[0][1] = element1;
        mass[1][0] = question2;
        mass[1][1] = element2;
        mass[2][0] = question3;
        mass[2][1] = element3;

        return mass;
    }

    public static ArrayList<String> generateProgression(int progression){
        var a1 = Engine.generateRandomValue(1,10);
        var a2 = a1 + progression;
        var a3 = a2 + progression;
        var a4 = a3 + progression;
        var a5 = a4 + progression;
        var a6 = a5 + progression;
        var a7 = a6 + progression;
        var a8 = a7 + progression;
        var a9 = a8 + progression;
        var a10 = a9 + progression;
        ArrayList<String> massString = new ArrayList<>();
        massString.add(String.valueOf(a1));
        massString.add(String.valueOf(a2));
        massString.add(String.valueOf(a3));
        massString.add(String.valueOf(a4));
        massString.add(String.valueOf(a5));
        massString.add(String.valueOf(a6));
        massString.add(String.valueOf(a7));
        massString.add(String.valueOf(a8));
        massString.add(String.valueOf(a9));
        massString.add(String.valueOf(a10));
        return massString;
    }

    public static ArrayList<String> getProgressionWithBottoms(ArrayList<String> massString, int index){
        massString.set(index, "...");
        return massString;
    }
}
