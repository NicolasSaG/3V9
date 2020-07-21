package herencia;
//Convertir a double año, mes y dia
import javax.swing.JOptionPane;

public class Datos {	
    Estudiante [] alumno = new Estudiante[1000];
    Profesor [] profe = new Profesor[1000];
	
    String nombre;
    int edad;
    String genero;
    int boleta, noempleado;
    int i = 0, p = 0;
	
    public void Menu(){
	boolean repeticion = true, validador = true;
        
	do {
            String opcion;
            do {
		opcion = JOptionPane.showInputDialog("MENU:\n" +
						"1)Dar de alta Estudiante\n" +
						"2)Dar de alta Profesor\n" +
						"3)Consulta de Estudiantes\n" +
						"4)Consulta de Profesores");
				
		if (!opcion.matches("[1-4]{1}")) {
                    validador = true;
                    JOptionPane.showMessageDialog(null, "Opcion no valida :V");
		}else {
                    validador = false;
		}
            } while (validador);
            switch (opcion) {
		case "1" -> {
                    altaEstudiantes();
                    //CONSTRUCTOR
                    alumno[i] = new Estudiante(nombre, edad, genero, boleta);
                    i++;
                }
		case "2" -> {
                    altaProfesores();
                    //CONSTRUCTOR
                    profe[p] = new Profesor(nombre, edad, genero, noempleado);
                    p++;
                }
		case "3" -> {
                    consultarEstudiantes();	
                    if (i == 0) {
                        JOptionPane.showMessageDialog(null, "No has dado de alta a ningun estudiante");
                    }
                }
                case "4" -> {
                    consultarProfesores();
                    if (p == 0) {
                        JOptionPane.showMessageDialog(null, "No has dado de alta a ningun profesor");
                    }
                }
		default -> JOptionPane.showMessageDialog(null, "Whaaaaat?");
            }		
	} while (repeticion);	
    }
	
    public void altaEstudiantes(){
        do {
            nombre = JOptionPane.showInputDialog("Ingresa el nombre:");
            if (!nombre.matches("[A-Za-z]{1,100}")) {
                JOptionPane.showMessageDialog(null, "Erroooor, ingresa un un nombre válido :P");
            }
        } while (!nombre.matches("[A-Za-z]{1,100}"));

        do {
            do {
                try {
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad:"));
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erroooor, ingresa una edad válida :P");
                }
            } while (true);
            if (!Integer.toString(edad).matches("[0-9]{1,100}")) {
                JOptionPane.showMessageDialog(null, "Erroooor, ingresa una edad válida :P");
            }
        } while (!Integer.toString(edad).matches("[0-9]{1,10}"));	
        do {
           genero = JOptionPane.showInputDialog("Ingresa el genero:");
            if (!genero.matches("[A-Za-z]{1,100}")) {
                JOptionPane.showMessageDialog(null, "Erroooor, ingresa un genero válido :P");
            }
        } while (!genero.matches("[A-Za-z]{1,100}"));
        do {
            do {
                try {
                    boleta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la boleta:"));
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erroooor, ingresa una boleta válida :P");
                }
            } while (true);
            if (!Integer.toString(boleta).matches("[0-9]{1,100}")) {
                JOptionPane.showMessageDialog(null, "Erroooor, ingresa una boleta válida :P");
            }
        } while (!Integer.toString(boleta).matches("[0-9]{1,10}"));	
    }

    public void altaProfesores(){
            do {
                    nombre = JOptionPane.showInputDialog("Ingresa el nombre profe:");
                    if (!nombre.matches("[A-Za-z]{1,100}")) {
                            JOptionPane.showMessageDialog(null, "Erroooor, ingresa un un nombre válido :P");
                    }
            } while (!nombre.matches("[A-Za-z]{1,100}"));


            do {
                    do {
                            try {
                                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad:"));
                                    break;
                            } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Erroooor, ingresa una edad válida :P");
                            }
                    } while (true);
                    if (!Integer.toString(edad).matches("[0-9]{1,100}")) {
                            JOptionPane.showMessageDialog(null, "Erroooor, ingresa una edad válida :P");
                    }
            } while (!Integer.toString(edad).matches("[0-9]{1,10}"));


            do {
                    genero = JOptionPane.showInputDialog("Ingresa el genero:");
                    if (!genero.matches("[A-Za-z]{1,100}")) {
                            JOptionPane.showMessageDialog(null, "Erroooor, ingresa un genero válido :P");
                    }
            } while (!genero.matches("[A-Za-z]{1,100}"));


            do {
                    do {
                            try {
                                    noempleado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de empleado:"));
                                    break;
                            } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Erroooor, ingresa un numero de empleado válido :P");
                            }
                    } while (true);
                    if (!Integer.toString(noempleado).matches("[0-9]{1,100}")) {
                            JOptionPane.showMessageDialog(null, "Erroooor, ingresa una boleta válida :P");
                    }
            } while (!Integer.toString(noempleado).matches("[0-9]{1,10}"));

    }

    public void consultarEstudiantes(){
            for (int j = 0; j < i; j++) {
                    JOptionPane.showMessageDialog(null,"Nombre: " + alumno[j].getNombre() + "\n" +
                                    "Edad: " + alumno[j].getEdad() + "\n" +
                                                    "Género: " + alumno[j].getGenero() + "\n" +
                                                                    "Boleta: " + alumno[j].getBoleta());
            }
    }

    public void consultarProfesores(){
            for (int j = 0; j < p; j++) {
                    JOptionPane.showMessageDialog(null,"Nombre: " + profe[j].getNombre() + "\n" +
                                    "Edad: " + profe[j].getEdad() + "\n" +
                                                    "Género: " + profe[j].getGenero() + "\n" +
                                                                    "Numero de Empleado: " + profe[j].getNoprofesor());
            }
    }	
}
