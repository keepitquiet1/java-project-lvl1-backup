package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Calc;
public class Engine {
    public static boolean even() {
        for (int i = 0; i <= 2; i++) {
            if (Even.runGame()) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + "!");
                }
            } else {
                System.out.println("Let's try again " + "!");
                break;
            }
        } return true;
    }
    public static boolean calc() {
        for (int i = 0; i <= 2; i++) {
            if (Calc.runGame()) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + "!");
                }
            } else {
                System.out.println("Let's try again " + "!");
                break;
            }
        } return true;
    }
    public static boolean gcd() {
        for (int i = 0; i <= 2; i++) {
            if (Gcd.runGame()) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + "!");
                }
            } else {
                System.out.println("Let's try again " + "!");
                break;
            }
        } return true;
    }
    public static boolean progression() {
        for (int i = 0; i <= 2; i++) {
            if (Progression.runGame()) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + "!");
                }
            } else {
                System.out.println("Let's try again " + "!");
                break;
            }
        } return true;
    }
    public static boolean prime() {
        for (int i = 0; i <= 2; i++) {
            if (Prime.runGame()) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, "  + "!");
                }
            } else {
                System.out.println("Let's try again "  + "!");
                break;
            }
        } return true;
    }
}
