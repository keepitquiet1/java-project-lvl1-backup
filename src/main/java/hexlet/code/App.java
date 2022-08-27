package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        start(1);
    }
    public static boolean start(int i) {
        if (i == 1) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            whatIsYourName(name);
            return true;
        } return false;
    }
    public static String whatIsYourName(String name) {
        for (var i = 0; i < 3; i++) {
        int rand = 1;
        System.out.println("Hello, " + name);
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        System.out.println("Question: " + rand);
        System.out.println("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String yesNo = sc.nextLine();
        if (isNumberParity(yesNo) == false) {
            break;
        }
        isNumberParity(yesNo);
        if (i == 2) {
            System.out.println("Congratulations, " + name + "!");
        }
        }
        return "Hello, " + name;
    }
    public static boolean isNumberParity(String yesNo) {

        int rand = 1;
            if ((rand % 2 == 0)&(yesNo.equals("yes"))) {
                System.out.println("Correct!");
            }
            if ((rand % 2 != 0)&(yesNo.equals("yes"))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + "!");
                return false;
        }
            if ((rand % 2 == 0)&(yesNo.equals("no"))) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, "  + "!");
                return false;
        } if ((rand % 2 != 0)&yesNo.equals("no")) {
                System.out.println("Correct!");
        } else {
                System.out.println("Try again!");
                return false;
            } return true;
    }
    }
