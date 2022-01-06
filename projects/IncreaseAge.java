package projects;
// import java.util.*;
// Only import utilities that you need.
// Otherwise it pollutes the namespace!
import java.util.Scanner;

public class IncreaseAge {

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        String coolName = "temporaryName";
        int coolAge = -1;

        System.out.print("Hello, what is your first name? ");
        while (userInput.hasNextInt()) {
            userInput.nextLine(); // Flush the buffer
            System.out.print("Sorry you entered an integer instead of your name.");
            System.out.print(" Please try again. ");
        }
        coolName = userInput.next(); // Just grabs first name
        // coolName = user.Input.nextLine(); // Grabs entire line typed by user
        userInput.nextLine(); // Flush the buffer

        System.out.print("Hi "+ coolName + "! How old are you? ");
        while (!userInput.hasNextInt()) {
            userInput.nextLine(); // Flush the buffer
            System.out.print("Sorry, you did not enter a valid integer age.");
            System.out.print(" Please try again. ");
        }
        coolAge = userInput.nextInt();

        System.out.println("Hello " + coolName 
            + ", in ten years you will be " 
            + (coolAge + 10) + "."
        );
        userInput.close();
    }
}
