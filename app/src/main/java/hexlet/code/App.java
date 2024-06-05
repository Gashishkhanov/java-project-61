package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;


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

    public static void runPointEnter(int pe) {
        switch (pe) {

            case 1:
                Cli.greet();
                break;

            case 2:
                Even.run();
                break;

            case 3:
                Calc.run();
                break;

            case 4:
                GCD.run();
                break;

            case 5:
                Progression.run();
                break;

            case 6:
                Prime.run();
                break;

            default:
                throw new RuntimeException("Please choose a number from 1 to 7!");
        }
    }
}
