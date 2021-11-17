import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeepGuessing {
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Initializes an input field

        /* Initialize Variables */
        int count = 0;
        int high = 0;
        int low = 0;
        int guess;
        int max = 100;
        int min = 1;
        int rand = (int) (Math.random() * (max - min)) + min; // Generate a random number between min and max

        /* Asks for input between valid range */
        System.out.println("Enter an integer between " + min + " and " + max);
        guess = scan.nextInt();

        /* If the guess isn't correct, keeps taking input and collecting data */
        while (count < 10) {
            if (guess != rand) {
                if (guess < rand) {
                    count++;
                    low++;
                    System.out.println("Too Low, Try again");
                } else {
                    count++;
                    high++;
                    System.out.println("Too high, Try again");
                }
                guess = scan.nextInt();
            } else {
                scan.close();
                System.out.println("YOU WIN!");
                System.out.println("Correct number: " + rand);
                System.out.println("Total guesses: " + count);
                System.out.println("Number of high guesses: " + high);
                System.out.println("Number of low guesses: " + low);
            }
        }
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            wait(1000);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            wait(80);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            wait(80);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            wait(80);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            wait(80);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            wait(80);
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
            wait(80);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            wait(80);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            wait(80);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            wait(80);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            System.out.println("Low level input control is not allowed " + e.getMessage());
        }
    }
}
