import java.lang.String;
import java.util.Scanner;
// Parent class
public abstract class Dog {
    protected String name; // Inherited by children

    // While the strings are the same printfs, the outputs will vary based on dog type
    public abstract void noise();
    public abstract void move();
    public abstract void getName(Scanner scan);
}
