package variablesPrivadas;

/**
 *
 * @author fnico
 */
public class Operaciones {
    private double lado1, lado2, lado3, resapcir, resapr, resapcaud, resapt;

    //LADO1
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado1() {
        return lado1;
    }
    //LADO 2
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getLado2() {
        return lado2;
    }
    //POSIBLE LADO 3
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public double getLado3() {
        return lado3;
    }

    //Metodos de Operaciones
    public double areaCir(){
        resapcir =  Math.PI * (lado1 * lado1);
        return resapcir;
    }
    public double perCir(){
        resapcir = Math.PI * lado1;
        return resapcir;
    }
}