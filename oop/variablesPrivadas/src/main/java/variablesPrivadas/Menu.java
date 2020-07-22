/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesPrivadas;

/**
 *
 * @author fnico
 */
import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Menu {
    Scanner sc = new Scanner(System.in);

    public void llamarMenu(){
        Operaciones op = new Operaciones();
        int opcion = 0;
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("= = = = = MENU = = = = =\n" +
                "1) Area y perimetro de circulo \n" +
                "2) Area y perimetro de rectangulo \n" +
                "3) Area y perimetro de un cuadrado \n" +
                "4) Area y perimetro de un triangulo \n" +
                "5) Salir \n" +
                "Que deseas?"));
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("Error No ingresate un valor válido");
            }
            System.out.println("antrs de switch");
            switch (opcion) {
                case 1 -> {
                    System.out.println("entramos a case 1");
                    JOptionPane.showMessageDialog(null, op.areaCir());
                    JOptionPane.showMessageDialog(null, op.perCir());
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> System.out.println("Adios :C");
                default -> System.out.println("Que pasho? eso no es una opcion valida :P");
            }
        }while(opcion != 5);
    }

    public String validarMenu(){
        //Se le declara e inicializa un string con ""
        String s1 = "";
        //Hacemos un while que se repetir mientras s1 no tenga nada ""
        while (s1.equals("")) {
            //Leemos lo que se ingrese por teclado y se lo asignamos a s1
            s1 = sc.nextLine();
            //No puedes ingresar signos aritmeticos :P
            if(!s1.matches("[1-5]{1}")){
                //Se le cambia el valor a s1 por "" para que se repita 
                s1 = "";
                //Le digo al usuario que hubo un error
                System.out.println("Error,  intentalo otra vez :c");
            }
        }
        //Si pasa el while, esta validado y lo regresamos a donde haya sido puesto el metodo C:
        return s1;
    }
}
