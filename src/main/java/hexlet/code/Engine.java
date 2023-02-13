package hexlet.code;

import hexlet.Utils;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Calc;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    private static int score = 0;

    public static void even(int number, String input) {

        Map<Integer, String> answers = new HashMap<>();
        answers.put(0, "yes");
        answers.put(1, "no");
        if (input.equalsIgnoreCase(answers.get(number % 2))) {
            System.out.println("Correct!");
            score++;
            if (score == 3) {
                System.out.println("Congrats! You won!");
                return;
            }
            Even.runGame();
        } else {
            System.out.printf("Incorrect! The correct answer is %s. Lets try again %s! %n", answers.get(number % 2), Even.getUserName());
        }

    }

    public static void calc(int a, int b, char sign, int input) {
        boolean isCorrect = false;
        switch (sign) {
            case '+':
                if (a + b != input) {
                    Utils.calcIsNotCorrect(a + b);
                    return;
                }
                break;
            case '-':
                if (a - b != input) {
                    Utils.calcIsNotCorrect(a - b);
                    return;
                }
                break;
            case '*':
                if (a * b != input) {
                    Utils.calcIsNotCorrect(a * b);
                    return;
                }
                break;
        }
        System.out.println("Correct!");

        score++;
        if (score == 3){
            System.out.printf("Congrats, %s! You won!%n", Utils.getName());
            return;
        }
        Calc.runGame();
    }

    public static boolean gcd() {
        for (int i = 0; i <= 2; i++) {
            if (Gcd.runGame()) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + "!");
                }
            } else {
                System.out.println("Let's try again " + "!");
                break;
            }
        }
        return true;
    }

    public static boolean progression() {
        for (int i = 0; i <= 2; i++) {
            if (Progression.runGame()) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + "!");
                }
            } else {
                System.out.println("Let's try again " + "!");
                break;
            }
        }
        return true;
    }

    public static boolean prime() {
        for (int i = 0; i <= 2; i++) {
            if (Prime.runGame()) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + "!");
                }
            } else {
                System.out.println("Let's try again " + "!");
                break;
            }
        }
        return true;
    }
}
