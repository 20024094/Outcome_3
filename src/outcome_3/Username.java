package outcome_3;

/**
 * Module: Software Development: Programming Foundations
 * Student: Daniel Barbu: 20024094
 * Application: Outcome 3
 * Version: 1.0
 * Date: 19/03/2024
 * File: Username.java
 *
 * @author Daniel Barbu
 */


/**
 * Username class provides a method to create a username from a
 * user first and last names.
 */
public class Username {

    /**
     * This file will generates a username by concatenating the first letter of
     * the first name and the full last name. The first letter of the first name
     * is in lowercase, and the first letter of the last name is in uppercase
     * with the rest in lowercase. This method ensures that the inputs are not
     * null or empty, and trims any leading or trailing whitespace.
     *
     * @param firstName The user first name.
     * @param lastName The user last name.
     * @return The generated username in the format of 'fLastname', where 'f' is
     * the lowercase first initial and 'Lastname' is the capitalized last name.
     * @throws IllegalArgumentException if either the first name or the last
     * name input is null or empty.
     */
    public String generateUsername(String firstName, String lastName) {
        // Validation: Check for null or empty inputs for first and last names to avoid any issues during processing.
        // Trim the input to remove leading and trailing whitespace that the user may have accidentally entered.
        if (firstName == null || lastName == null || firstName.isEmpty() || lastName.isEmpty()) {
            throw new IllegalArgumentException("First name and last name must not be empty");
        }

        /* Processing: Start with the first name.
        Trim any whitespace and extract the first character. 
        The Character.toLowerCase() method is used to
        ensure this character is in lowercase regardless of how the user entered it.*/
        char firstInitial = Character.toLowerCase(firstName.trim().charAt(0));
        /* Processing: Continue with the last name.
        First, trim any whitespace from the last name to ensure a clean, uniform format.
        Then, separate the first letter and capitalize it while ensuring the rest of the letters are in lowercase.
        This is achieved by using substring to isolate parts of the string and then applying the appropriate casing.*/
        String surname = lastName.trim().substring(0, 1).toUpperCase()
                + lastName.trim().substring(1).toLowerCase();

        // Output: Combine the processed first initial and surname to form the desired username format.
        // This username is then returned to the calling function.
        return firstInitial + surname;
    }

}
