package games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Greet {
    public static void getGreet(){
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        var client = new Cli(scanner.nextLine());
        System.out.println("Hello, " + client.getName() + "!");
    }
}
