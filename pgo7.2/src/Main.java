
public class Main {
    public static void main(String[] args) {

        Cat Felek = new Cat("Felek");
        System.out.println(Felek.getName());
        Felek.start();
        System.out.println(Felek.getType());
        Felek.stop();

    }
}