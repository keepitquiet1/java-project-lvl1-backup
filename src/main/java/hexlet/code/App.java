package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        if (!start()) return;
        whatIsYourName();
        String yN = isNumberParity();
        playGame(yN);



    }

    public static boolean start() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        if (gameNumber != 1) return false;
        return true;
    }

    public static String whatIsYourName() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

    public static boolean playGame(String yN) {
        System.out.println("Hello, ");
        double a = Math.random() * 100;
        int rand = (int) a;
        for (var i = 0; i < 3; i++) {
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            System.out.println("Question: " + rand);
            System.out.println("Your answer: ");
            if (playGame(yN) == false) {
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations!");
            }
            if ((rand % 2 == 0) & (yN.equals("yes"))) {
                System.out.println("Correct!");
            } else if ((rand % 2 != 0) & (yN.equals("yes"))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again!");
                return false;
            } else if ((rand % 2 == 0) & (yN.equals("no"))) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again!");
                return false;
            } else if ((rand % 2 != 0) & yN.equals("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("Try again later");
                return false;
            }
        }
            return true;
        }

        public static String isNumberParity () {
            Scanner sc = new Scanner(System.in);
            String yN = sc.nextLine();
            return yN;
        }
}

//    int rand = 3;
