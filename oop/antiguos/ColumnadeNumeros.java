
public class ColumnadeNumeros {
	public static void main(String[] args) {
		
		int i, j;

		System.out.println("Programa que escribe 2 columnas de numeros del 1 al 100:");
		for (i = 1; i <= 100 ; i++) {
			j = 101 - i;
			System.out.println(i + "   " + j);
		}
	}
}