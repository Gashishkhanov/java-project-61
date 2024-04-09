package hexlet.code;
import hexlet.code.games.*;
import java.util.Scanner;
import static hexlet.code.Engine.run;

public class App {
    public static void main(String[] args) {

        // Начало игры
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: ");
        int pointEnter = scanner.nextInt();

        runPointEnter(pointEnter);
    }

    public static void runPointEnter(int pe){
        switch (pe){

            case 1:
                Cli.getGreet();
                break;

            case 2:
                run(Even.generateRounds(), Even.getRules());
                break;

            case 3:
                run(Calc.generateRounds(), Calc.getRules());
                break;

            case 4:
                run(GCD.generateRounds(), GCD.getRules());
                break;

            case 5:
                run(Progression.generateRounds(), Progression.getRules());
                break;

            case 6:
                run(Prime.generateRounds(), Prime.getRules());
                break;

        }
    }
}