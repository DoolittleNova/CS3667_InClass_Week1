import java.lang.String;
import java.util.Scanner;
// Parent class
public abstract class Dog {
    protected String name = null; // Inherited by children
    protected String dog_t = "dog";
    protected String move_t = "moved";
    protected String noise_t = "dog sound";

    // While the strings are the same printfs, the outputs will vary based on dog type
    public abstract void noise();
    public abstract void move();
    public void getName(Scanner scan) {
        System.out.printf("Enter the name of your %s: ", dog_t);
        name = scan.nextLine();
    }
}
