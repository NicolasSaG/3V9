package herencia;

/**
 *
 * @author fnico
 */
public class Profesor extends Persona {
	 
    private int noempleado;
	    
    public Profesor(String nombre, int edad, String genero, int noempleado){
	super(nombre,edad,genero);
        this.noempleado = noempleado;
    }

    public int getNoprofesor() {
	return noempleado;
    }
}