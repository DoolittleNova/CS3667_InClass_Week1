public class Poodle extends Dog{
    private String name = "poodle";
    private String move_t = "bolt";
    private String noise_t = "yip";

    public void move(){
        System.out.printf("The %s %ss.\n", name, move_t);
    }

    public void noise() {
        System.out.printf("The %s %sed!\n", name, noise_t);
    }
}
