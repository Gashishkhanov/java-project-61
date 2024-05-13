package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static void run(String[][] rounds, String rules){

        var name = Cli.greet();

        System.out.println(rules);

        for (int i =0; i<3; i++) {
            System.out.println("Question: " + rounds[i][0]);
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();
            if (userAnswer.equals(rounds[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;( . Correct answer was " + rounds[i][1]);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
