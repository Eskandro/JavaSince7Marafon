package day9.Task2;

public class Triangle extends Figure {
    int firsSide;
    int secondSide;
    int thirdSide;
    double p = firsSide + secondSide + thirdSide / 2;

    public Triangle(String color, int firsSide, int secondSide, int thirdSide) {
        super(color);
        this.firsSide = firsSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double area() {
        return Math.sqrt(p * (p - firsSide) * (p - secondSide) * (p - thirdSide));

    }

    @Override
    public double perimeter() {
        return firsSide + secondSide + thirdSide;
    }
}
