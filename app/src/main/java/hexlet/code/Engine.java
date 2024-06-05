package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static void run(String[][] rounds, String rules) {

        var name = Cli.greet();

        System.out.println(rules);

        for (String[] round: rounds) {
            System.out.println("Question: " + round[0]);
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();
            if (userAnswer.equals(round[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;( . Correct answer was " + round[1]);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static final int GENERAL_VALUE = 3;
}
