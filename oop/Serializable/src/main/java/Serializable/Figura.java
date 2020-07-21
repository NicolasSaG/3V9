package Serializable;

import java.io.Serializable;

public abstract class Figura implements Serializable{
    private double x, y;

    //Constructor con los 2 elementos 
    
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public abstract double Area();
    
}
