 import java.util.Scanner;
public class CantidadesyPrecios {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);

		int a;
		double b, c;
		char d = '$';
		System.out.println("Programa que lee cantidades y precios, al final indica la factura:");
		System.out.println("Ingresa la cantidad vendida:");
		a = Leer.nextInt();
		System.out.println("Introduce el precio de uno:");
		b = Leer.nextDouble();
		c = a * b;
		System.out.println("Total de factura: " + d + c);
	}
}