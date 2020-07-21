package semanaOOP;


import javax.swing.JOptionPane;

public class Menu {

	String repeticion;
	public void llamarMenu(){
			boolean repetir[] = {true, false};
		do {
			String menu [] = {"Calcular tu Edad", "Telefono", "Ejercicio3", "Ejercicio4","Ejercicio5", "Ejercicio6",
			"Ejercicio7"};
			String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona lo que deseas:", "MENU", 1, null, menu, menu[0]);
			int opc = 0;
			
			if (opcion.equals("Calcular tu Edad")) {
				opc = 0;
			}
			else if (opcion.equals("Telefono")) {
				opc = 1;
			}
			else if (opcion.equals("Ejercicio3")) {
				opc = 2;
			}
			else if (opcion.equals("Ejercicio4")) {
				opc = 3;
			}
			else if (opcion.equals("Ejercicio5")) {
				opc = 4;
			}
			else if (opcion.equals("Ejercicio6")) {
				opc = 5;
			}
			else if (opcion.equals("Ejercicio7")) {
				opc = 6;
			}
			
			switch (opc) {
			//Edad de Persona
			case 0:
				EdadPersona edp = new EdadPersona();
				do {
					try {
						edp.pedirDatos();
						break;
					} catch (NullPointerException e) {
						System.out.println("Adios :C");
						System.exit(0);
					}
				} while (true);
				do {
					try {
						edp.calcularEdad();
						break;
					} catch (NullPointerException e) {
						System.out.println("Adios :C");
						System.exit(0);
					}
				} while (true);
				
				break;
			case 1:
				Llamadastelefonicas llm = new Llamadastelefonicas();
				llm.ingresaryconsultarCredito();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				break;
			}
		
			do {
				repeticion = JOptionPane.showInputDialog("Desea repetir? si = 1 / no = 0");
			} while (!repeticion.matches("[0-1]{1}"));
			
			if (repeticion.equals("0")) {
				System.exit(0);
				
			}
		} while (repeticion.equals("1"));
		
	}
}
