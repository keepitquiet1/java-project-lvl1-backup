package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        if (gameNumber == 0) {
            System.out.println("Bye!");
        }
        if (gameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
        }
        if (gameNumber == 2) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Scanner ss = new Scanner(System.in);
            String name = ss.nextLine();
            System.out.println("Hello, " + name);
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            for (int i = 0; i <= 2; i++) {
                if (playGame(name)) {
                    if (i == 2) {
                        System.out.println("Congratulations, " + name + "!");
                    }
                } else {
                    break;
                }
            }
        }
        else if (gameNumber == 3) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Scanner ss = new Scanner(System.in);
            String name = ss.nextLine();
            System.out.println("Hello, " + name + "!");
            System.out.println("What is the result of the expression?");
            for (int i = 0; i <= 2; i++) {
                if (calculator()) {
                    if (i == 2) {
                        System.out.println("Congratulations, " + name + "!");
                    }
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
        }
        else if (gameNumber == 4) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Scanner ss = new Scanner(System.in);
            String name = ss.nextLine();
            System.out.println("Hello, " + name + "!");
            System.out.println("Find the greatest common divisor of given numbers.");
            for (int i = 0; i <= 2; i++) {
                if (GCD()) {
                    if (i == 2) {
                        System.out.println("Congratulations, " + name + "!");
                    }
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
        }
    }
    public static boolean playGame(String name) {
        final int hundred = 100;
        double a = Math.random() * hundred;
        int rand = (int) a;
        System.out.println("Question: " + rand);
        System.out.println("Your answer: ");
        Scanner sv = new Scanner(System.in);
        String yN = sv.nextLine();
        if ((rand % 2 == 0) & (yN.equals("yes"))) {
            System.out.println("Correct!");
            return true;
        } else if ((rand % 2 != 0) & (yN.equals("yes"))) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again " + name + "!");
            return false;
        } else if ((rand % 2 == 0) & (yN.equals("no"))) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again " + name + "!");
            return false;
        } else if ((rand % 2 != 0) & yN.equals("no")) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Try again " + name + "!");
            return false;
        }
    }
    public static boolean calculator() {
        final int hundred = 100;
        double a = Math.random() * hundred;
        double b = Math.random() * hundred;
        String[] plusMinus;
        plusMinus = new String[3];
        plusMinus[0] = "*";
        plusMinus[1] = "+";
        plusMinus[2] = "-";
        int f1 = (int) a;
        int f2 = (int) b;
        Random z = new Random();
        int n = z.nextInt(3);
        System.out.println("Question: " + f1 + plusMinus[n] + f2);
        System.out.println("Your answer: ");
        Scanner sf = new Scanner(System.in);
        int answer = sf.nextInt();
        if (plusMinus[n].equals("+")) {
            if (f1+f2==(int)answer) {
                System.out.println("Correct!");
            } else {
                int trueAnswer = f1+f2;
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer);
                return false;
            }
        }
        if (plusMinus[n].equals("-")) {
            if (f1-f2==(int)answer) {
                System.out.println("Correct!");
            } else {
                int trueAnswer = f1-f2;
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer);
                return false;
            }
        }
        if (plusMinus[n].equals("*")) {
            if (f1*f2==(int)answer) {
                System.out.println("Correct!");
            } else {
                int trueAnswer = f1*f2;
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer);
                return false;
            }
        }
        return true;
    }
    public static boolean GCD() {
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
        for (int i = 1; i<=n1 && i<=n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        } if (answer != gcd) {
            System.out.println(answer +" is wrong answer ;(. Correct answer was " + gcd);
            return false;
        }
        return true;
    }
}
