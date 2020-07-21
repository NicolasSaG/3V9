public class Producto1020 {
	public static void main(String[] args) {
		int i;
		long producto = 1;

		System.out.println("Programa que calcula el producto de los numeros enteros del 10 al 20:" + "\n");
		
		for (i = 10; i <= 20; i++) {
			producto = producto * i;
		}

		System.out.println("El resultado de el producto de los numeros enteros del 10 al 20 es: " + "\n" + producto);
	}
}