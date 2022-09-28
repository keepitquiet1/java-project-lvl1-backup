package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    public static boolean runGame() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        final int hundred = 100;
        double a = Math.random() * hundred;
        int rand = (int) a;
        System.out.println("Question: " + rand);
        System.out.println("Your answer: ");
        Scanner sv = new Scanner(System.in);
        String yN = sv.nextLine();
        Engine.even();
        if ((rand % 2 == 0) & (yN.equals("yes"))) {
            return true;
        } else if ((rand % 2 != 0) & (yN.equals("no"))) {
            return true;
        } else if ((rand % 2 != 0) & (yN.equals("yes"))) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            return false;
        } else if ((rand % 2 == 0) & (yN.equals("no"))) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            return false;
        } else {
            return false;
        }
    }
}
