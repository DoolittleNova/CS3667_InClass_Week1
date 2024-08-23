import java.util.Scanner;

// Child of Dog
public class Poodle extends Dog{
    
    // Child constructor
    public Poodle() {
        this.dog_t = "poodle";
        this.move_t = "bolted";
        this.noise_t = "yip";
    }
    // Polymorphic implementation of Dog.move()
    public void move(){
        System.out.printf("%s %s!\n", name, move_t);
    }
    // Polymorphic implementation of Dog.noise()
    public void noise() {
        System.out.printf("The %s named %s said %s!\n", dog_t, name, noise_t);
    }
}
