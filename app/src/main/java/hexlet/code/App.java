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
        String str1 = scanner1.next();

        // Приветствие
        if (str1.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("May I have your name?");
            var client = new Cli(scanner.nextLine());
            System.out.println("Hello, " + client.getName());
        }
    }
}
