package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String str = scanner.nextLine();
        System.out.println(str.getName());
    }
}
