/*
 * Author:      Nova Doolittle
 * Date:        08/21/2024 (Fall 2024)
 * Filename:    Demo.java
 * Assignment:  In Class: Java & Git Practice (08/21)
 */


// Container class for assignment

import java.io.InputStream;
import java.util.Scanner;

public class Demo {
    // Main method
    public static void main(String[] args) {
        /*
         * Begin user Input block
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter dog type (poodle or lab): ");
        String in = scan.nextLine(); // Get dog type from user.

        // We ought to sanitize input, but I can't remember the lowercase function or implementation. Nor do I particularly want to bring the regex library in.
        
        // Input validation
        while(!in.equals("lab") && !in.equals("poodle")) {
            System.out.print("Error: Input not a supported type of dog!\nEnter dog type: ");
            in = scan.nextLine();
        }

        /*
         * End User Input block
         */

        // Assign dog accordingly
        Dog doggy = in.equals("lab") ? new Lab() : new Poodle(); // My apologies for this implementation.

        // Get name of dog
        doggy.getName(scan);
        scan.close(); // Close scanner
        // Make the silly lil guy do some stuff
        doggy.noise();
        doggy.move();
    }
}
