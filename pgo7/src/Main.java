import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Figure circle = new Circle(2.0);

        Figure parallelogram = new Parallelogram(8,6, 7);

        Figure rectangle = new Rectangle(8,10);

        ArrayList<Figure> figureList = new ArrayList<>(3);
        figureList.add(circle);
        figureList.add(parallelogram);
        figureList.add(rectangle);

        for(Figure figure: figureList){
            System.out.println(figure.getType());
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Permieter: " + figure.getPerimeter() + "units.");
        }

    }
}