package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Funciones {
    
    //Método para guardar archivo
    public void guardarArchivo(){
        try {
            double x = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la base:"));
            double y = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura:"));
            Figura rectangulo = new Rectangulo(x, y);
            Figura triangulo = new Triangulo(x, y);
            
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Figura.bin"));
            
            salida.writeObject(rectangulo);
            salida.writeObject(triangulo);
            
            salida.close();
        } 
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el archivo...");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public void leerArchivo() throws ClassNotFoundException{
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Figura.bin"));
            //String str = (String)entrada.readObject();
            Figura rectangulo = (Figura)entrada.readObject();
            Figura triangulo = (Figura)entrada.readObject();
            
            JOptionPane.showMessageDialog(null, rectangulo.getClass().getName() + " \n X= " 
                    + rectangulo.getX() + "\n Y= " + rectangulo.getY() + "\n Area del rectangulo: " + rectangulo.Area());
            JOptionPane.showMessageDialog(null, triangulo.getClass().getName() + " \n X= " 
                    + triangulo.getX() + "\n Y= " + triangulo.getY() + "\n Area del triangulo: " + triangulo.Area());
            entrada.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al leer el archivo...");
        }
    }
}
