import java.util.Scanner;
public class ProgramaEstructurado2 {
	public static void main(String[] args) {
		
		Scanner Leer = new Scanner(System.in);
		int sexo, edad;

		System.out.println("Ingresa tu sexo: \n 1)Femenino \n 2)Masculino" );
		sexo = Leer.nextInt();
		System.out.println("Ingresa tu edad:");
		edad = Leer.nextInt();
		//Mujer
		if (sexo == 1 && edad >= 18) {
			System.out.println("Eres Mujer mayor de edad.");
		}
		else if (sexo == 1 && edad < 18) {
			System.out.println("Eres Mujer menor de edad." );
		}
		//Hombre
		if (sexo == 2 && edad >= 18) {
			System.out.println("Eres Hombre mayor de edad.");
		}
		else if (sexo == 2 && edad < 18) {
			System.out.println("Eres Hombre menor de edad.");
		}

		if (sexo != 1 && sexo != 2) {
			System.out.println("No ingresaste una opcion valida para el sexo");
		}
		if (edad < 0) {
			System.out.println("No puedes usar este programa porque aun no naces :v jajaja");
		}
		if (edad > 80) {
			System.out.println("¿Todavia sigues vivo? :O ");
		}
	}
}