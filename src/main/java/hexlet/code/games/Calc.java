package hexlet.code.games;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static boolean runGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        final int hundred = 100;
        final int lengthArr = 3;
        double a = Math.random() * hundred;
        double b = Math.random() * hundred;
        String[] plusMinus;
        plusMinus = new String[lengthArr];
        plusMinus[0] = "*";
        plusMinus[1] = "+";
        plusMinus[2] = "-";
        int f1 = (int) a;
        int f2 = (int) b;
        Random z = new Random();
        int n = z.nextInt(lengthArr);
        System.out.println("Question: " + f1 + plusMinus[n] + f2);
        System.out.println("Your answer: ");
        Scanner sf = new Scanner(System.in);
        int answer = sf.nextInt();
        if (plusMinus[n].equals("+")) {
            if (f1 + f2 == (int) answer) {
                System.out.println("Correct!");
            } else {
                int trueAnswer = f1 + f2;
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer);
                return false;
            }
        }
        if (plusMinus[n].equals("-")) {
            if (f1 - f2 == (int) answer) {
                System.out.println("Correct!");
            } else {
                int trueAnswer = f1 - f2;
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer);
                return false;
            }
        }
        if (plusMinus[n].equals("*")) {
            if (f1 * f2 == (int) answer) {
                System.out.println("Correct!");
            } else {
                int trueAnswer = f1 * f2;
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer);
                return false;
            }
        }
        return true;
    }
}
