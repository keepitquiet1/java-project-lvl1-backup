package hexlet.code.games;
import java.util.Scanner;

public class Gcd {
    public static boolean runGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        final int hundred = 100;
        double a = Math.random() * hundred;
        double b = Math.random() * hundred;
        int n1 = (int) a;
        int n2 = (int) b;
        System.out.println("Question: " + n1 + " " + n2);
        System.out.println("Your answer: ");
        Scanner sf = new Scanner(System.in);
        int answer = sf.nextInt();
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        if (answer != gcd) {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + gcd);
            return false;
        }
        return true;
    }
}
