import java.util.Scanner;
public class Producto3 {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		double a, b, producto;
		System.out.println("Programa que pide 2 numeros menores o iguales a 5 y muestra se el producto de estos es mayor a 10 e indica si es impar o par: \n");
		System.out.println("Escribe el primer numero (debe ser menor o igual a 5):");
		a = Leer.nextDouble();
		System.out.println("Escribe el segundo numero (debe ser menor o igual a 5):");
		b = Leer.nextDouble();
		
		producto = a * b;

		if (a <= 5 && b <= 5) {
			if (producto > 10) {
				System.out.println("El producto de los numeros es mayor a 10 ya que es: " + producto);
				if(producto%2 == 0){  
	            	System.out.println("El producto es numero par");  
	        	}
	        	else{  
	            	System.out.println("El producto es numero impar");  
	        	}
			}

			else if (producto < 10) {
				System.out.println("El producto de los numeros no es mayor a 10 ya que vale: " + producto);
				if(producto%2 == 0){  
	            	System.out.println("El producto es numero par");  
	        	}
	        	else{  
	            	System.out.println("El producto es numero impar");  
	        	}
			}
		}
		else if (a > 5 || b > 5) {
			System.out.println("Error: El numero o numeros que ingresaste es mayor a 5 xd");
		}
	}
}