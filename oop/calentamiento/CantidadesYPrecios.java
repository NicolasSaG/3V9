import java.util.Scanner;

public class CantidadesYPrecios{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precios[16];
		int cantidad[16];

		System.out.println("Programa que lee cantidades y precios, al final indica la factura:");
		for(int i = 0; i < 16; i++){
			System.out.println("Ingresa la cantidad vendida:");
			cantidad[i] = sc.nextInt();
			System.out.println("Introduce el precio unitario:");
			precios[i] = sc.nextDouble();
			c = cantidad[i] * precios[i];
			System.out.println("Total de factura: $" + c);
		}
	}
}