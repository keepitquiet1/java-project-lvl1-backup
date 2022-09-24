package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Prime {
    public static boolean runGame() {
        Cli.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int thous = 1000;
        int number = Utils.getRandomNumber(1, thous);
        System.out.println("Question " + number);
        Scanner ss = new Scanner(System.in);
        String answer = ss.nextLine();
        Engine.engine();
        for (int i = 2; i <= number / 2; i++) {
            int tmp = number % i;
            if ((tmp == 0)) {
                if (answer.equals("no")) {
                    continue;
                } else if (answer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    return false;
                } else {
                    if (answer.equals("yes")) {
                        continue;
                    } else if (answer.equals("no")) {
                        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                        return false;
                    }
                }
            }

        } return true;
    }
}
