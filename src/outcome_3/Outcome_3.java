package outcome_3;

import java.util.Scanner; // Import Scanner class for reading input from console

/**
 * Module: Software Development: Programming Foundations
 * Student: Daniel Barbu: 20024094
 * Application: Outcome 3
 * Version: 1.0
 * Date: 19/03/2024
 * File: Outcome_3.java
 *
 * @author Daniel Barbu
 */


/**
 * The Main class for demonstrating the use of UsernameGenerator.
 */
public class Outcome_3 {

    /**
     * The main method serves as the entry point for the Java application. It
     * handles user input, processes it using the Username class, and outputs
     * the result.
     *
     * @param args Command line arguments which are not used in this
     * application.
     */
    public static void main(String[] args) {
        // Instantiate a new Username object to utilize its username generation functionality. 
        Username generator = new Username();

        // Scanner is used here to parse primitive types and strings using regular expressions.
        // System.in is passed to Scanner to parse user input from the default input stream (console).
        Scanner scanner = new Scanner(System.in);

        // Interaction: Query the user for their first name with a clear instruction.
        System.out.println("Enter your first name:");
        // Wait and read the entire line of input from the user, which is expected to be the first name.
        String firstName = scanner.nextLine();

        // Repeat the process for the last name, prompting the user and awaiting their input.
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        // Utilize the generateUsername method of the Username instance to create a username.
        // The input from the user is passed to the method, and the returned string is stored in the 'username' variable.
        String username = generator.generateUsername(firstName, lastName);

        // Display the final output the generated username is printed to the console.
        // This confirms to the user that the input was processed and the expected action was completed.
        System.out.println("The generated username is: " + username);

        // It's important to close the Scanner to prevent resource leaks.
        // This is a good practice especially in larger applications where resource management is critical.
        scanner.close();
    }

}
