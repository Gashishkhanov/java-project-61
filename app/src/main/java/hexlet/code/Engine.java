package hexlet.code;

import java.security.SecureRandom;
import java.util.Arrays;

public class Engine {
    public static int getRandomValueFrom1to100(){
        int minValue = 1;
        int maxValue = 100;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return randomValue;
    }

    public static int getRandomValueFrom1to50(){
        int minValue = 1;
        int maxValue = 50;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return randomValue;
    }

    public static int getRandomValueFrom1to9(){
        int minValue = 1;
        int maxValue = 9;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return randomValue;
    }

    public static String getRandomOperator(){
        var random = new SecureRandom();
        var operator = Arrays.asList("+", "*");
        var randomElement = operator.get(random.nextInt(operator.size()));
        return randomElement;
    }
}
