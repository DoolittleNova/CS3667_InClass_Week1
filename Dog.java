import java.lang.String;
// Parent class
public abstract class Dog {
    private String name = "dog";
    private String move_t = "meander";
    private String noise_t = "bark";
    
    public void move(){
        System.out.printf("The %s %ss.\n", name, move_t);
    }

    public void noise() {
        System.out.printf("The %s %sed!\n", name, noise_t);
    }
}
