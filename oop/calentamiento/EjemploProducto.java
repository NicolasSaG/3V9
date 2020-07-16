import java.util.Scanner;

public class EjemploProducto{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, producto;

		System.out.println("Programa que pide 2 numeros menores o iguales a 5 y muestra se el producto de estos es mayor a 10 e indica si es impar o par: \n");
		System.out.println("Escribe el primer numero (debe ser menor o igual a 5):");
		a = sc.nextDouble();
		System.out.println("Escribe el segundo numero (debe ser menor o igual a 5):");
		b = sc.nextDouble();
		
		if(a > 5)
			System.out.println("Error: El primer numero es mayor que 5: " + a);
		else if(b > 5)
			System.out.println("Error: El segundo numero es mayor que 5: " + b);
		else{
			producto = a * b;
			if(producto > 10)
				System.out.println("El producto "+ producto +" de los numeros es mayor a 10");
			else
				System.out.println("El producto "+ producto +" de los numeros es menor a 10");
			
			if(producto % 2  == 0)
				System.out.println("El producto es par");
			else
				System.out.println("El producto es impar");
		}
	}
}