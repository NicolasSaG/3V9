package buscaminas;
/**
 *
 * @author fnico
 */
import javax.swing.JButton;
public class Boton extends JButton{
   //Se declara un entero para las bombas
   int bomba = 0;
   //Posicion
   int x, y;
   
   //Cantidad de minas alrededor
   int numeroMinasAlrededor = 0;
   
   //constructor para inicializar posicion
   public Boton(int _x, int _y){
       x = _x;
       y = _y;
   }
}
