package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
    }
    public static boolean start(int i) {
        if (i == 1) {
            System.out.println("Welcome to the Brain Games!");
        } return true;
    }
    public static String whatIsYourName(String name) {
        System.out.println("May I have your name?");
            return "May I have your name? " + " " + name;

    }

    }
