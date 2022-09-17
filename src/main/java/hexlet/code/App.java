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
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        final int gameNumber2 = 2;
        final int gameNumber3 = 3;
        final int gameNumber4 = 4;
        final int gameNumber5 = 5;
        final int gameNumber6 = 6;
        if (gameNumber == 0) {
            System.out.println("Bye!");
        }
        if (gameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
        }
        if (gameNumber == gameNumber2) {

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
        if (gameNumber == gameNumber3) {
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
        if (gameNumber == gameNumber4) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Scanner ss = new Scanner(System.in);
            String name = ss.nextLine();
            System.out.println("Hello, " + name + "!");
            System.out.println("Find the greatest common divisor of given numbers.");
            for (int i = 0; i <= 2; i++) {
                if (gcd()) {
                    if (i == 2) {
                        System.out.println("Congratulations, " + name + "!");
                    }
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
        }
        if (gameNumber == gameNumber5) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Scanner ss = new Scanner(System.in);
            String name = ss.nextLine();
            System.out.println("Hello, " + name + "!");
            System.out.println("What number is missing in the progression?");
            for (int i = 0; i <= 2; i++) {
                if (progression()) {
                    if (i == 2) {
                        System.out.println("Congratulations, " + name + "!");
                    }
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
        }
        if (gameNumber == gameNumber6) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Scanner ss = new Scanner(System.in);
            String name = ss.nextLine();
            System.out.println("Hello, " + name + "!");
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            for (int i = 0; i <= 2; i++) {
                if (prime()) {
                    System.out.println("Correct!");
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

    public static boolean gcd() {
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

    public static boolean progression() {
        final int lowerBound = 5;
        final int upperBound = 10;
        int lengthArray = getRandomNumber(lowerBound, upperBound);
        int secretIndex = getRandomNumber(0, lengthArray - 1);
        final int stepNum = 9;
        final int hundred = 100;
        int step = getRandomNumber(1, stepNum);
        int firstNumber = getRandomNumber(0, hundred);
        System.out.println("Question: ");
        int[] arr = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            arr[i] = firstNumber + (step * i);
            if (i == secretIndex) {
                System.out.println("..");
            } else {
                System.out.println(arr[i]);
            }
        }
        Scanner ss = new Scanner(System.in);
        int answer = ss.nextInt();
        if (arr[secretIndex] != answer) {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + arr[secretIndex] + ".");
            return false;
        }
        System.out.println("Correct!");
        return true;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static boolean prime() {
        final int thous = 1000;
        int number = getRandomNumber(1, thous);
        System.out.println("Question " + number);
        Scanner ss = new Scanner(System.in);
        String answer = ss.nextLine();
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
