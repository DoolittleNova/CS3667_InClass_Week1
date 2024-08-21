import java.util.Scanner;

public class Lab extends Dog {
    private String dog_t = "lab";
    private String move_t = "ran";
    private String noise_t = "woof";

    public void move(){
        System.out.printf("%s %s!\n", name, move_t);
    }

    public void noise() {
        System.out.printf("The %s named %s said %s!\n", dog_t, name, noise_t);
    }

    public void getName(Scanner scan) {
        System.out.printf("Enter the name of your %s: ", dog_t);
        name = scan.nextLine();
    }
}