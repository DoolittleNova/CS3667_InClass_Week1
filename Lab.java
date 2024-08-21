public class Lab extends Dog {
    private String name = "lab";
    private String move_t = "run";
    private String noise_t = "woof";

    public void move(){
        System.out.printf("The %s %ss.\n", name, move_t);
    }

    public void noise() {
        System.out.printf("The %s %sed!\n", name, noise_t);
    }
}