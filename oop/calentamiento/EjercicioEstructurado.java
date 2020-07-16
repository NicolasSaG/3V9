import java.util.Scanner;
public class EjercicioEstructurado1 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que lee tres valores y dice cual es mayor, el menor, o si son iguales");

		System.out.println("Ingrese el primer numero:");
		a = sc.nextDouble();
		System.out.println("Ingrese el segundo numero:");
		b = sc.nextDouble();
		System.out.println("Ingrese el tercer numero");
		c = sc.nextDouble();

		if (a > b && a > c) {
			System.out.println("El numero mayor es el primero: " + a);
		}
		else if (a < b && a < c) {
			System.out.println("El numero menor es el primero: " + a);
		}

		if (b > a && b > c) {
			System.out.println("El numero mayor es el segundo: " + b);
		}
		else if (b < a && b < c) {
			System.out.println("El numero menor es el segundo: " + b);
		}

		if (c > b && c > a) {
			System.out.println("El numero mayor es el tercero: " + c);
		}
		else if (c < b && c < a) {
			System.out.println("El numero menor es el tercero: " + c);
		}
		
		//DOS IGUALES Y UNO DIFERENTE
		if (a == b && a != c) {
			System.out.println("El primer y el segundo numero son iguales...");
		}
		if (a == c && a != b) {
			System.out.println("El primer y el tercer numero son iguales...");
		}
		if (b == c && b != a) {
			System.out.println("El segundo y el tercer numero son iguales...");
		}

		//NUMEROS IGUALES
		if (a == b && b == c) {
			System.out.println("Ingresaste numeros iguales xd---");
		}
	}
}