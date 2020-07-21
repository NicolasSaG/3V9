import java.util.Scanner;
public class Cuadrado {
	public static void main(String[] args) {
		
		int numero, columna, fila;
		Scanner Leer = new Scanner(System.in);
		System.out.println("Programa que lee un numero y muestra un cuadrado del tamano del numero:");
		System.out.println("Escribe el tamaño de un lado del cuadrado:");
		numero = Leer.nextInt();

		for (fila = 0; fila < numero; fila++ ) {
			System.out.print(" +");
			for (columna = 2;columna < numero; columna++ ) {
				System.out.print(" +");
			}
			System.out.print(" + \n");
		}
	}
}