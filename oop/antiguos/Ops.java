import java.util.Scanner;
public class Ops {
	Scanner Leer = new Scanner(System.in);
	 

	public void escogerMetodo(){
		System.out.println("Escoge una opcion:");
		System.out.println("1) Sacar perimetro y area de un triangulo");
		System.out.println("2) Sacar perimetro y area de un cuadrado");
		System.out.println("3) Sacar volumen de una esfera");
		System.out.println("4) Sacar volumen de un cilindro");

		int opcion = Leer.nextInt();
		double a, b, c, area, perimetro, volumen, pi;
		switch (opcion) {
			case 1: 
				System.out.println("Has escogido sacar el perimetro y area de un triagulo:");
				System.out.println("Agrega el lado 1:");
				a = Leer.nextDouble();
				System.out.println("Agrega el lado 2:");
				b = Leer.nextDouble();
				System.out.println("Agrega el lado 3:");
				c = Leer.nextDouble();
				perimetro = a + b + c;
				// raiz cuadrada de(6*(6-2)*(6-4)*(0))
				area = (Math.sqrt((perimetro/2) * ((perimetro/2) - a) * ((perimetro/2) - b) * ((perimetro/2) - c)));
				System.out.println("El perimetro del triangulo es: " + perimetro);
				System.out.println("El area del triangulo es: " + area);
			break;

			case 2: 
				System.out.println("Has escogido sacar el perimetro y area de un cuadrado:");
				System.out.println("Agrega el lado 1:");
				a = Leer.nextDouble();
				perimetro = a * 4;
				area = a * a;
				System.out.println("El perimetro del cuadrado es: " + perimetro);
				System.out.println("El area del cuadrado es: " + area);
			break;

			case 3: 
				System.out.println("Has escogido sacar el volumen de una esfera:");
				System.out.println("Agrega el radio de la esfera:");
				a = Leer.nextDouble();
				pi = Math.PI;
				volumen = (4 * pi * Math.pow(a,3)) / 3;
				System.out.println("El volumen de la esfera es: " + volumen);
			break;

			case 4: 
				System.out.println("Has escogido sacar el volumen de un cilindro:");
				
				System.out.println("Agrega el radio del cilindro:");
				a = Leer.nextDouble();
				System.out.println("Agrega la altura del cilindro:");
				b = Leer.nextDouble();
				pi = Math.PI;

				volumen = pi * Math.pow(a, 2) * b;
				System.out.println("El volumen del cilindro es: " + volumen);
			break;

			default: 
				System.out.println("ERROR :v");
				System.out.println("Escogiste una opcion no valida...");
			break;
		}
	}
}

// double n, o;
// System.out.println("Escogiste Potencia:");
// System.out.println("Introduce el primer numero:");
// n = Lee.LeeDouble();
// System.out.println("Introduce el exponente del numero:");
// o = Lee.LeeDouble();
// int r= 0,otro = 1; 
// for(int x = 0;x < o;x++){
// 	r=0;
// 	for(int i=0;i < n;i++){
// 			r = r + otro;
//         }
//    otro = r;
// }
// System.out.println("Resultado: " + r);


// int num1;
// System.out.println("Ingresa el numero:");
// num1 = Lee.LeeInt();

// int aj = 0, ab = 1;
// for (int i = 0;i < num1; i++) {
// 	aj = 0;
// 	for (int x = 0; x < num1; x++) {
// 		aj = aj + ab;
// 	}
// 	ab = aj;
// }
// System.out.println("Resultado: " + aj);
