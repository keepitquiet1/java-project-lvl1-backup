package hexlet.code;
import hexlet.code.games.*;

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
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        String selectedGame = scanner.next();
        System.out.println();
        final int gameNumber2 = 2;
        final int gameNumber3 = 3;
        final int gameNumber4 = 4;
        final int gameNumber5 = 5;
        final int gameNumber6 = 6;
        switch (selectedGame){
            case "1":
                Cli.greet();
                break;
            case "2":
                Even.runGame();
                break;
            case "3":
                Calc.runGame();
                break;
            case "4":
                Gcd.runGame();
                break;
            case "5":
                Progression.runGame();
                break;
            case "6":
                Prime.runGame();
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid number entered. Restart the game.");
                break;
            }

            scanner.close();
        }
}
