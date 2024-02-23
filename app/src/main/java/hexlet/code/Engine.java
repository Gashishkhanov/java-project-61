package hexlet.code;

import java.security.SecureRandom;
import java.util.Arrays;

public class Engine {
    public static int getRandomValue(int minValue, int maxValue){
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }

    public static String getRandomOperator(String oper, String oper1){
        var random = new SecureRandom();
        var operator = Arrays.asList(oper, oper1);
        return operator.get(random.nextInt(operator.size()));
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
