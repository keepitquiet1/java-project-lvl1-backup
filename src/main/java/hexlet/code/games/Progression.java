package hexlet.code.games;
import hexlet.code.Utils;

import java.util.Scanner;

public class Progression {
    public static boolean runGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What number is missing in the progression?");
        final int lowerBound = 5;
        final int upperBound = 10;
        int lengthArray = Utils.getRandomNumber(lowerBound, upperBound);
        int secretIndex = Utils.getRandomNumber(0, lengthArray - 1);
        final int stepNum = 9;
        final int hundred = 100;
        int step = Utils.getRandomNumber(1, stepNum);
        int firstNumber = Utils.getRandomNumber(0, hundred);
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
}
