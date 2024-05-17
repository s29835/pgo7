abstract class Animal implements Moveable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(getType() + " starts!");

    }

    @Override
    public void stop() {
        System.out.println(getType() + " stopped!");

    }
    abstract String getType();
    public String getName(){
        return name;
    }
}
