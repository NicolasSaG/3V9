import java.util.Scanner;
public class Cuadrado {
	public static void main(String[] args) {
		int tam, columna, fila;
		Scanner sc = new Scanner(System.in);

		System.out.println("Programa que lee un numero y muestra un cuadrado del tamano del numero:");
		System.out.println("Escribe el tamaño de un lado del cuadrado:");
		tam = sc.nextInt();

		for (fila = 0; fila < tam; fila++){
			for (columna = 0;columna < tam; columna++ ) {
				System.out.print(" +");
			}
			System.out.print("\n");
		}
	}
}