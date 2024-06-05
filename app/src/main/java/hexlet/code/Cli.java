package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        var client = scanner.nextLine();
        System.out.println("Hello, " + client + "!");
        return client;
    }
}
