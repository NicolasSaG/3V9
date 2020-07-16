import java.util.Scanner;

public class EjemploSuma{
	public static void main(String [] args){
		int suma, num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa para pedir 15 numeros por consola y escribir la suma usando la sentencia for");
		suma = 0;
		for (int i = 0; i < 15; i++) {
			System.out.println("Ingresa el numero " + (i+1) + ": ");
			num  = sc.nextInt();
			suma += num;
		}

		System.out.println("Resultado: " + suma);
	}
}