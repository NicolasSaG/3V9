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
public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    
    public Persona(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    //GET
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    
    //SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
