/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author fnico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Datos dt = new Datos();
        do {
            try {
                dt.Menu();
                
                break;
            } catch (NullPointerException e) {
                System.exit(0);
            }
        } while (true);
    }
    
}
