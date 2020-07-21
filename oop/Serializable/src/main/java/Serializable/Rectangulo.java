package Serializable;

public class Rectangulo extends Figura{

    public Rectangulo(double x,double y) {
        super(x,y);
    }

    @Override
    public double Area() {
        return getX()*getY();
    }
}
