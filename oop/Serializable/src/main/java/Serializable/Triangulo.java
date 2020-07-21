package Serializable;

public class Triangulo extends Figura{
    public Triangulo(double x,double y) {
        super(x,y);
    }

    @Override
    public double Area() {
        return (getX() * getY()) / 2;
    }
}
