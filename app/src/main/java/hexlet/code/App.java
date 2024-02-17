package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Начало игры
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Your choice: ");
        String str1 = scanner1.nextLine();

        // Приветствие
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        var client = new Cli(scanner.nextLine());
        System.out.println("Hello, " + client.getName());

        // игра на четность
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int a = (int) Math.round(Math.random());
        System.out.println("Questiom: " + a);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Your answer: ");
        String str2 = scanner2.nextLine();

        var count = 0;

        while (count <= 3) {
            if ((a % 2 == 0) && (str2.equals("yes") || (str2.equals("Yes")))) {
                System.out.println("Correct!");
                count++;
            }

            if ((a % 2 != 0) && (str2.equals("no") || (str2.equals("No")))) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(str2 + " is wrong answer ;(");
                System.out.println("Let's try again, " + client + "!");
                count = 0;
            }
        }

        System.out.println("Congratulations " + client + "!");

    }
}
