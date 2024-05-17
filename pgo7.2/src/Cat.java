public class Cat extends Animal implements Moveable {
    public Cat(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "Cat";
    }
}
