import java.util.Scanner;
public class LeertresValores {
	public static void main(String[] args) {

		Scanner Leer = new Scanner(System.in);

		double a, b, c;

		System.out.println("PROGRAMA QUE PERMITe LEER TRES VALORES Y ALMACENARLOS EN LAS VARIABLES A, B Y C RESPECTIVAMENTE. EL ALGORITMO IMPRIMe CUAL ES EL MAYOR Y CUAL ES EL MENOR.  PRESENTE UN MENSAJE DE ALERTA EN CASO DE QUE SE DETECTE LA INTRODUCCIÓN DE VALORES IGUALES.");

		System.out.println("Ingrese un numero:");
		a = Leer.nextDouble();
		System.out.println("Ingrese otro numero:");
		b = Leer.nextDouble();
		System.out.println("Ingrese cualquier numero:");
		c = Leer.nextDouble();

		if (a == b && b == c) {
			System.out.println("Ingresaste numeros iguales... :v");
		}

		//a
		if (a > b && a > c) {
			System.out.println("El numero mayor es: " + a);
		}
		if (a < b && a < c) {
			System.out.println("El numero menor es " + a);
		}

		//b
		if (b > a && b > c) {
			System.out.println("El numero mayor es: " + b);
		}
		if (b < a && b < c) {
			System.out.println("El numero menor es " + b);
		}

		//c

		if (c > a && c > b) {
			System.out.println("El numero mayor es: " + c);
		}
		if (c < b && c < a) {
			System.out.println("El numero menor es " + c);
		}
		
	}
}

//Competencia --- octubre 18, 250 y 300 