/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraGrafica;

/**
 *
 * @author fnico
 */
public class Datos {
    private double num1, num2;
    
    
    public double getNum1() {
        return num1;
    }

    public Datos(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //Constructor vacio
    public Datos() {
    }
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double suma (){
        return num1 + num2;
    }
    
    public double resta (){
        return num1 - num2;
    }    
}

