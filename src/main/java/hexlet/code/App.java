package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        System.out.println("May I have your name?");
        Scanner ss = new Scanner(System.in);
        String name = ss.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        if (gameNumber == 1) {
            for (int i = 0; i < 3; i++) {
                if (playGame(name) == true) {
                    continue;
                } if (i == 3) {
                    System.out.println("Congratulations, " + name + "!");
                } else if (playGame(name) == false) {
                    break;
                }
            }
        } else {
            System.out.println("Bye!");
        }
    }
    public static boolean playGame(String name) {
        double a = Math.random() * 100;
        int rand = (int) a;
            System.out.println("Question: " + rand);
            System.out.println("Your answer: ");
            Scanner sv = new Scanner(System.in);
            String yN = sv.nextLine();
            if ((rand % 2 == 0) & (yN.equals("yes"))) {
                System.out.println("Correct!");
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
            } else {
                System.out.println("Try again " + name + "!");
                return false;
            }
            return true;
    }
}
//            } else if (playGame(yN) == false) {
//                System.out.println("Try again, " + name + "!");
//                break;
//            }
