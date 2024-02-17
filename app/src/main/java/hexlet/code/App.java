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
        int pointEnter = scanner1.nextInt();

        // Приветствие
        if (pointEnter == 1) {
            System.out.println("Welcome to the Brain Games!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("May I have your name?");
            var client = new Cli(scanner.nextLine());
            System.out.println("Hello, " + client.getName() + "!");

            // игра на четность
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            var count = 0;
            while (count < 3) {
                int minValue = 1;
                int maxValue = 100;
                int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                System.out.println("Questiom: " + randomValue);
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Your answer: ");
                String str2 = scanner2.nextLine();

                //отработка правильных ответов
                if ((randomValue % 2 == 0) && (str2.equals("yes") || (str2.equals("Yes")))) {
                    System.out.println("Correct!");
                    count++;
                }

                if ((randomValue % 2 != 0) && (str2.equals("no") || (str2.equals("No")))) {
                    System.out.println("Correct!");
                    count++;
                }

                //отработка неправильных ответов
                if ((randomValue % 2 != 0) && (str2.equals("yes") || (str2.equals("Yes")))) {
                    System.out.println(str2 + " is wrong answer ;( . Correct answer was 'no'");
                    System.out.println("Let's try again, " + client.getName() + "!");
                    count = 0;
                }

                if ((randomValue % 2 == 0) && (str2.equals("No") || (str2.equals("no")))) {
                    System.out.println(str2 + " is wrong answer ;(. Correct answer was 'yes'");
                    System.out.println("Let's try again, " + client.getName() + "!");
                    count = 0;
                }
            }

            System.out.println("Congratulations, " + client.getName() + "!");
        }
    }
}
