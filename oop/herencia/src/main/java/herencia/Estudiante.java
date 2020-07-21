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
public class Estudiante extends Persona{
    
    private int boleta;
    
    public Estudiante(String nombre, int edad, String genero, int boleta){
        super(nombre,edad,genero);
        this.boleta = boleta;
    }

    public int getBoleta() {
        return boleta;
    }  
}

