package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;

    public Cli(String name){
        this.name = name;
    }

    public static String getName(){
        return name;
    }

    public static void getGreet(){
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        var client = new Cli(scanner.nextLine());
        System.out.println("Hello, " + getName() + "!");
    }
}
