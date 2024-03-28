package hexlet.code;

import games.Even;
import games.Greet;

import java.util.Scanner;

public class Engine {

    public static void runPointEnter(int pe){
        switch (pe){

            case 1:
                Greet.getGreet();
                break;

            case 2:
                Engine.run(Even.generateRounds(), Even.getRules());
                break;

//            case 3:
//                Engine.run();
//                break;
//
//            case 4:
//                Engine.run();
//                break;
//
//            case 5:
//                Engine.run();
//                break;
//
//            case 6:
//                Engine.run();
//                break;

        }
    }

    public static void run(String[][] rounds, String rules){

        Greet.getGreet();

        System.out.println(rules);

        for (int i =0; i<3; i++) {
            System.out.println(rounds[i][0]);
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();
            if (userAnswer.equals(rounds[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;( . Correct answer was " + rounds[i][1]);
                i = 0;
            }
        }

        System.out.println("Congratulations, " + Cli.getName() + "!");

    }


    public static int generateRandomValue(int minValue, int maxValue){
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }

//    public static String getRandomOperator(String oper, String oper1){
//        var random = new SecureRandom();
//        var operator = Arrays.asList(oper, oper1);
//        return operator.get(random.nextInt(operator.size()));
//    }
//
//    public static int gcd(int a,int b) {
//        while (b !=0) {
//            int tmp = a%b;
//            a = b;
//            b = tmp;
//        }
//        return a;
//    }
//
//    public static ArrayList<String> getProgression(int progression){
//        var a1 = Engine.getRandomValue(1,10);
//        var a2 = a1 + progression;
//        var a3 = a2 + progression;
//        var a4 = a3 + progression;
//        var a5 = a4 + progression;
//        var a6 = a5 + progression;
//        var a7 = a6 + progression;
//        var a8 = a7 + progression;
//        var a9 = a8 + progression;
//        var a10 = a9 + progression;
//        ArrayList<String> massString = new ArrayList<>();
//        massString.add(String.valueOf(a1));
//        massString.add(String.valueOf(a2));
//        massString.add(String.valueOf(a3));
//        massString.add(String.valueOf(a4));
//        massString.add(String.valueOf(a5));
//        massString.add(String.valueOf(a6));
//        massString.add(String.valueOf(a7));
//        massString.add(String.valueOf(a8));
//        massString.add(String.valueOf(a9));
//        massString.add(String.valueOf(a10));
//        return massString;
//    }
//
//    public static ArrayList<String> getProgressionWithBottoms(ArrayList<String> massString, int index){
//        massString.set(index, "...");
//        return massString;
//    }
//
//    public static boolean isPrime(int numberToCheck){
//        int remainder;
//        boolean isPrime = true;
//
//        for (int i = 2; i <= numberToCheck / 2; i++) {
//            remainder = numberToCheck % i;
//
//            if (remainder == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        if (isPrime) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
}
