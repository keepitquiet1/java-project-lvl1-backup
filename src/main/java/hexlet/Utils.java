package hexlet;

import hexlet.code.Cli;

import java.util.Scanner;

public class Utils {

    static private String name;
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String getName(Scanner scanner){
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static void calcIsNotCorrect(int correctAnswer){
        System.out.printf("Incorrect! The correct answer is %d. Lets try again %s! %n", correctAnswer, name);
    }
    public static String getName() {
        return name;
    }



}
