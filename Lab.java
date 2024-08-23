import java.util.Scanner;

// Child of Dog
public class Lab extends Dog {

    // Child constructor
    public Lab() {
        this.dog_t = "lab";
        this.move_t = "ran";
        this.noise_t = "woof";
    }
    public void move(){
        System.out.printf("%s %s!\n", name, move_t);
    }

    public void noise() {
        System.out.printf("The %s named %s said %s!\n", dog_t, name, noise_t);
    }
}