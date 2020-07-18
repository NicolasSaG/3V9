import java.util.Scanner;
//import Operaciones;
class Menu{
	public static void main(String[] args) {
		init();
	}

	public static void init(){
		int opcion;
		double a, b, c, area, perimetro, volumen;
		imprimirMenu();
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		switch(opcion){
			case 1:
				System.out.println("Has escogido sacar el perimetro y area de un triagulo:");
				System.out.println("Agrega el lado 1:");
				a = sc.nextDouble();
				System.out.println("Agrega el lado 2:");
				b = sc.nextDouble();
				System.out.println("Agrega el lado 3:");
				c = sc.nextDouble();
				perimetro = Operaciones.perimetroTriangulo(a, b, c);
				area = Operaciones.areaTriangulo(a, b, c);
				System.out.println("El perimetro del triangulo es: " + perimetro);
				System.out.println("El area del triangulo es: " + area);
			break;
			case 2:
				System.out.println("Has escogido sacar el perimetro y area de un cuadrado:");
				System.out.println("Agrega el tamano del lado:");
				a = sc.nextDouble();
				perimetro = Operaciones.perimetroCuadrado(a);
				area = Operaciones.areaCuadrado(a);
				System.out.println("El perimetro del cuadrado es: " + perimetro);
				System.out.println("El area del cuadrado es: " + area);
			break;
			case 3:
				System.out.println("Has escogido sacar el volumen de una esfera:");
				System.out.println("Agrega el radio de la esfera:");
				a = sc.nextDouble();
				volumen = Operaciones.volumenEsfera(a);
				System.out.println("El volumen de la esfera es: " + volumen);
			break;
			case 4:
				System.out.println("Has escogido sacar el volumen de un cilindro:");
				System.out.println("Agrega el radio del cilindro:");
				a = sc.nextDouble();
				System.out.println("Agrega la altura del cilindro:");
				b = sc.nextDouble();
				volumen = Operaciones.volumenCilindro(a, b);
				System.out.println("El volumen del cilindro es: " + volumen);
			break;
			default:
				System.out.println("ERROR :v");
				System.out.println("Escogiste una opcion no valida...");
			break;
				
		}
	}
	
	public static void imprimirMenu(){
		System.out.println("Escoge una opcion:");
		System.out.println("1) Sacar perimetro y area de un triangulo");
		System.out.println("2) Sacar perimetro y area de un cuadrado");
		System.out.println("3) Sacar volumen de una esfera");
		System.out.println("4) Sacar volumen de un cilindro");
	}
}