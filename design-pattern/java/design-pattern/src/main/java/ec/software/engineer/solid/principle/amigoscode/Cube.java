package ec.software.engineer.solid.principle.amigoscode;

public class Cube implements Shape, ThreeDimensionalShape{


    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 0;
    }
}
