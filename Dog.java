import java.lang.String;
// Parent class
public class Dog {
    protected String name = "dog";
    protected String noise_t = "bark";
    protected String move_t = "meander";
    
    public void move(){
        System.out.printf("The %s %ss.\n", name, move_t);
    }

    public void noise() {
        System.out.printf("The %s %sed!\n", name, noise_t);
    }
}
