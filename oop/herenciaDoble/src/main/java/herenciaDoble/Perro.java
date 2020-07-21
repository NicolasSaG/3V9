/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaDoble;

/**
 *
 * @author fnico
 */
import javax.swing.JOptionPane;

public class Perro extends Animal{

    public Perro(String especie) {
        super(especie);
    }

    @Override
    public void comunica(){
        JOptionPane.showMessageDialog(null, "Guau! Guau!");
    }
}

