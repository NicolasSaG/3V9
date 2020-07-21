package herenciaDoble;

/**
 *
 * @author fnico
 */
public class Main {
    public static void main(String[] args) {
        //Perro normal
        Perro manchas = new Perro("Manchas");
        manchas.comunica();

        //Perro domesticado
        Perro buddy = new PerroDomesticado("Buddy");
        //Imprimir buddy sabe dar la pata
        ((PerroDomesticado) buddy).truco();
    }
    
}
