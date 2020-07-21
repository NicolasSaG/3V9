import java.util.Scanner;
public class SumaTotal {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		int i, num, suma_total;
		System.out.println("Programa que pide 15 numeros y escribe la suma total con la sentencia for:");
		suma_total = 0;
		for (i = 1;i <= 15; i++) {
			System.out.println("Escribe un numero: ");
			num = Leer.nextInt();
			suma_total = suma_total + num;
		}

		System.out.println("La suma es: " + suma_total);

	}
}