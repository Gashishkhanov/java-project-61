package hexlet.code;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Начало игры
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Your choice: ");
        int pointEnter = scanner1.nextInt();

        //Приветствие
        if (pointEnter == 1) {
            System.out.println("Welcome to the Brain Games!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("May I have your name?");
            var client = new Cli(scanner.nextLine());
            System.out.println("Hello, " + client.getName() + "!");
        }

        //Проверка входа в игру "четность нечетность"
        if (pointEnter == 2) {
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
                String answer = scanner2.nextLine();

                //отработка правильных ответов
                if ((randomValue % 2 == 0) && (answer.equals("yes") || (answer.equals("Yes")))) {
                    System.out.println("Correct!");
                    count++;
                }

                if ((randomValue % 2 != 0) && (answer.equals("no") || (answer.equals("No")))) {
                    System.out.println("Correct!");
                    count++;
                }

                //отработка неправильных ответов
                if ((randomValue % 2 != 0) && (answer.equals("yes") || (answer.equals("Yes")))) {
                    System.out.println(answer + " is wrong answer ;( . Correct answer was 'no'");
                    System.out.println("Let's try again, " + client.getName() + "!");
                    count = 0;
                }

                if ((randomValue % 2 == 0) && (answer.equals("No") || (answer.equals("no")))) {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'yes'");
                    System.out.println("Let's try again, " + client.getName() + "!");
                    count = 0;
                }
            }

            System.out.println("Congratulations, " + client.getName() + "!");
        }

        //Проверка входа в игру "Калькулятор"
        if (pointEnter == 3){
            System.out.println("Welcome to the Brain Games!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("May I have your name?");
            var client = new Cli(scanner.nextLine());
            System.out.println("Hello, " + client.getName() + "!");


            //Калькулятор
            System.out.println("What is the result of the expression?");
            var count = 0;
            while (count < 3) {
                //первый случайный операнд
                int minValue = 1;
                int maxValue = 50;
                int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                //второй случайный операнд
                int minValue1 = 1;
                int maxValue1 = 9;
                int randomValue1 = minValue1 + (int) (Math.random() * (maxValue1 - minValue1 + 1));
                //случайный оператор
                var random = new SecureRandom();
                var operator = Arrays.asList("+", "*");
                var randomElement = operator.get(random.nextInt(operator.size()));

                System.out.println("Questiom: " + randomValue + " " + randomElement + " " + randomValue1);
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Your answer: ");
                int answer2 = scanner3.nextInt();

                //отработка правильных\неправильных ответов
                if (randomElement.equals("+")){
                    int expr = randomValue + randomValue1;
                    if (answer2 == expr){
                        System.out.println("Correct!");
                        count++;
                    }
                    else {
                        System.out.println(answer2 + " is wrong answer ;(. Correct answer was " + expr);
                        System.out.println("Let's try again, " + client.getName() + "!");
                        count = 0;
                    }
                }
                if (randomElement.equals("*")) {
                    int expr = randomValue * randomValue1;
                    if (answer2 == expr){
                        System.out.println("Correct!");
                        count++;
                    }
                    else {
                        System.out.println(answer2 + " is wrong answer ;(. Correct answer was " + expr);
                        System.out.println("Let's try again, " + client.getName() + "!");
                        count = 0;
                    }
                }
            }

            System.out.println("Congratulations, " + client.getName() + "!");
        }

        //проверка на вход в НОД
        if (pointEnter == 4) {
            System.out.println("Welcome to the Brain Games!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("May I have your name?");
            var client = new Cli(scanner.nextLine());
            System.out.println("Hello, " + client.getName() + "!");


            //НОД
            System.out.println("Find the greatest common divisor of given numbers.");
            var count = 0;
            while (count < 3){
                //первый случайный операнд
                int minValue = 1;
                int maxValue = 50;
                int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                //второй случайный операнд
                int minValue1 = 1;
                int maxValue1 = 50;
                int randomValue1 = minValue1 + (int) (Math.random() * (maxValue1 - minValue1 + 1));

                System.out.println("Question: " + randomValue + " " + randomValue1);
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Your answer: ");
                int answer2 = scanner3.nextInt();

                var correct = Engine.gcd(randomValue, randomValue1);
                if (answer2 == correct){
                    System.out.println("Correct!");
                    count++;
                }
                else {
                    System.out.println(answer2 + " is wrong answer ;(. Correct answer was " + correct);
                    System.out.println("Let's try again, " + client.getName() + "!");
                    count = 0;
                }

                System.out.println("Congratulations, " + client.getName() + "!");
            }
        }
    }
}
